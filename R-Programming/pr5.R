A = matrix(c(50:58), nrow = 3, ncol = 3, byrow = T)
print(A)
print(A[2,]) #extracts rows
print(A[,2]) #extracts columns
print(A[3,3])
diag(A) #gives diagonal
