setwd("C:/Users/Urvashi/Desktop/Study/Courses/Data Science For Engineers/R Examples")

# install.packages("class", dependencies = TRUE)
rm(list=ls())

wine <- read.csv("wine.csv")
View(wine)
str(wine)
summary(wine)

# elbow method
k.max <- 10
wss <- rep(NA, k.max)
nClust <- list()
for(i in 1:k.max) {
  driveClasses <- kmeans(wine, i)
  wss[i] <- driveClasses$tot.withinss
  nClust[[i]] <- driveClasses$size
}

plot(1:k.max, wss, type="b", pch = 19, xlab = "Number of Clusters K", ylab = "Total within cluster sum of squares")

scale(wine, center = T, scale = T)

wineCluster <- kmeans(wine, 3, nstart = 25)
print(wineCluster)