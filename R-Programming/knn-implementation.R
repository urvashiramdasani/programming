setwd("C:/Users/Urvashi/Desktop/Study/Courses/Data Science For Engineers/R Examples")

# install.packages("class", dependencies = TRUE)
rm(list=ls())

library(caret)
library(class)

ServiceTrain <- read.csv("serviceTrainData.csv")
ServiceTest <- read.csv("serviceTestData.csv")

View(ServiceTest)
View(ServiceTrain)

str(ServiceTest)
str(ServiceTrain)

summary(ServiceTest)
summary(ServiceTrain)

predictedknn <- knn(ServiceTrain[,-6], ServiceTest[,-6], cl = ServiceTrain$Service, k = 3)
print(predictedknn)

conf_matrix <- confusionMatrix(data = predictedknn, ServiceTest$Service)
print(conf_matrix)