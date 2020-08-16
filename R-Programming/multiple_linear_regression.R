setwd("C:/Users/Urvashi/Desktop/Study/Courses/Data Science For Engineers/R Examples")
nyc <- read.csv("nyc.csv")
View(nyc)
head(nyc)
tail(nyc)

plot(nyc, main = "Pairwise Scatter Plot")
round(cor(nyc),3)

nycmod_1 <- lm(Price~Food+Service+Decor+East,data=nyc)
nycmod_2 <- lm(Price~., data = nyc)
summary(nycmod_1)

nycmod_3 <- lm(Price~Food+Decor+East,data=nyc)
summary(nycmod_3)