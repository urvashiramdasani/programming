setwd("C:/Users/Urvashi/Desktop/Study/Courses/Data Science For Engineers/R Examples")
Train_Data <- read.csv("Titanic_Train.csv")
Test_Data <- read.csv("Titanic_Test.csv")
View(Test_Data)
View(Train_Data)
logismodel <- glm(data = Train_Data, family = "binomial", Survived~.)
summary(logismodel)

library(caret)
logistrain <- predict(logismodel, type = 'response')
tapply(logistrain, Train_Data$Survived, mean)
logisPred <- predict(logismodel, newdata = Test_Data, type = 'response')

Test_Data[logisPred<=0.5, "LogisPred"] <- "0"
Test_Data[logisPred>0.5, "LogisPred"] <- "1"

confusionMatrix(table(Test_Data[,1], Test_Data[,5]), positive = "0")