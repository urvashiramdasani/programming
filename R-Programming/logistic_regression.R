setwd("C:/Users/Urvashi/Desktop/Study/Courses/Data Science For Engineers/R Examples")
rm(list=ls())
# install.packages("caret",dependencies = T)
library(caret)
crashTest_1 <- read.csv("crashTest_1.csv", row.names = 1)
crashTest_1_Test <- read.csv("crashTest_1_TEST.csv", row.names = 1)
View(crashTest_1_Test)
View(crashTest_1)
str(crashTest_1)
str(crashTest_1_Test)
summary(crashTest_1)
summary(crashTest_1_Test)

logisfit <- glm(CarType~., family = "binomial", data = crashTest_1) # Generalized Linear Model
summary(logisfit)
logisTrain <- predict(logisfit, type = 'response') # gives odds as probabilities
plot(logisTrain)  # else gives odds as log(odds)
tapply(logisTrain, crashTest_1$CarType, mean) # important
logisPred <- predict(logisfit, newdata = crashTest_1_Test, type = 'response')
plot(logisPred)

# classify the data
crashTest_1_Test[logisPred<=0.5, "LogisPred"] <- "Hatchback"
crashTest_1_Test[logisPred>0.5, "LogisPred"] <- "SUV"

confusionMatrix(table(crashTest_1_Test[,7], crashTest_1_Test[,6]), positive = 'Hatchback')