
# #print(data)
# mean(data$salary)
# print(max(data$yrs.since.phd))
# median(data$yrs.service)
# var(data$salary)

# x = pnorm(2, mean = 0, sd = 1, lower.tail = T)
# print(2*x-1)

setwd("C:/Users/Urvashi/Desktop/Study/Courses/Data Science For Engineers/R Examples")
data<-read.csv("bigcity.csv")
x = mean(data$X_1920)
y = mean(data$Y_1930)
#print(x-y)
#t.test(data,mu = 0)
t.test(data$X_1920,data$Y_1930,paired = F)