# A = matrix(c(4,5,16,7,2,-3,2,3,3,4,5,6,4,7,8,9),nrow = 4,byrow = T)
# library(pracma)
# Rank(A)

# A = matrix(c(1,0,-1,2,0,3,1,-1,2,4,0,3,-3,1,2,4),nrow=4,byrow = T)
# B = matrix(c(1,2,3,-1,0,-1,4,2),nrow=4,byrow = T)
# C = matrix(c(3,8,0,5,1,0,-4,8),nrow=2,byrow = T)
# library(pracma)
# C = cbind(A,B)
# print(C)
# Rank(C)
# Rank(A)
# D = C%*%A%*%B
# print(D)

# Z = matrix(c(-2,32,24,92,66,25,-80,40,20),nrow=3,byrow=T)
# det(Z)

# P = matrix(c(2,1,2,1,0,1,3,1,3),nrow=3,byrow=T)
# library(pracma)
# det(P)
# print(inv(P))

# A = matrix(c(1,6,1,1,2,3,0,0,3),nrow = 3,byrow = T)
# ev = eigen(A)
# values = ev$values
# print(values)
# det(A)
# print(t(A))
# print(det(t(A)))

A = matrix(c(6,1,-2,5,3,-3,12,2,-4),nrow = 3,byrow = T)
B = matrix(c(-8,4,-16),byrow = T,nrow = 3)
det(A)
X = inv(A)%*%B
print(X)
