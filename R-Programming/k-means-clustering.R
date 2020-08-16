setwd("C:/Users/Urvashi/Desktop/Study/Courses/Data Science For Engineers/R Examples")

# install.packages("class", dependencies = TRUE)
rm(list=ls())

tripDetails <- read.csv("tripDetails.csv", row.names = 1)
View(tripDetails)
str(tripDetails)
summary(tripDetails)

tripCluster <- kmeans(tripDetails, 3)
print(tripCluster)

# elbow method
k.max <- 10
wss <- rep(NA, k.max)
nClust <- list()
for(i in 1:k.max) {
  driveClasses <- kmeans(tripDetails, i)
  wss[i] <- driveClasses$tot.withinss
  nClust[[i]] <- driveClasses$size
}

plot(1:k.max, wss, type="b", pch = 19, xlab = "Number of Clusters K", ylab = "Total within cluster sum of squares : Trips")