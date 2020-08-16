setwd("C:/Users/Urvashi/Desktop/Study/Courses/Data Science For Engineers/R Examples")
data<-read.csv("Auto.csv")
# print(data)
automod<-lm(mpg~weight, data = data)
summary(automod)

alpha = 0.5
n = 300
p = 1
qt(1-(alpha/2),df = n-p-1)
qqnorm(50)