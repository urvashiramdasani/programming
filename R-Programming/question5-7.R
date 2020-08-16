setwd("C:/Users/Urvashi/Desktop/Study/Courses/Data Science For Engineers/R Examples")
auto_mpg <- read.csv("auto_mpg.csv")
View(auto_mpg)
summary(auto_mpg)
model_1 <- lm(auto_mpg$MPG~., data = auto_mpg)
summary(model_1)

model_2 <- lm(MPG~weight+model_year, data = auto_mpg)
summary(model_2)

model_3 <- lm(data = auto_mpg, formula = MPG~cylinders+horsepower+weight+model_year)
summary(model_3)