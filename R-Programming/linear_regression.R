setwd("C:/Users/Urvashi/Desktop/Study/Courses/Data Science For Engineers/R Examples")

bonds<-read.delim("bonds.txt",row.names = 1) # reading a text file

print(bonds) # this displays in console
View(bonds) # this opens a new window
head(bonds)
tail(bonds)
str(bonds) # structure of bonds
summary(bonds)

plot(bonds$CouponRate, bonds$BidPrice, main = "Bid Price vs Coupon Rate", xlab = "Coupon Rate", ylab = "Bid Price")

bondsmod<-lm(BidPrice~CouponRate, data = bonds) # building linear regression model

summary(bondsmod)
abline(bondsmod)

alpha = 0.05
n = 35
p = 1 # number of independent variables
qt(p = (1-alpha/2), df = n-p-1) # estimating t statistics value i.e., quantiles

SSE<-sum((bonds$BidPrice - bondsmod$fitted.values)^2)
SSR<-sum((bondsmod$fitted.values - mean(bonds$BidPrice))^2)
f0 = (SSR/SSE)*(n-2)
print(f0)

# residual plot
# plot(bondsmod$fitted.values, rstandard(bondsmod), main = "Residual Plot", xlab = "Predicted Values", ylab = "Standardized Residuals")
# abline(h = 2, lty = 2)
# abline(h = -2, lty = 2)
# identify(bondsmod$fitted.values, rstandard(bondsmod))

# identified points are 4 13 34 35
bonds_new<-bonds[-13,]
# bondsmod1<-lm(BidPrice~CouponRate, data = bonds_new)
# summary(bondsmod1)
# plot(bondsmod1$fitted.values, rstandard(bondsmod1), main = "Residual Plot", xlab = "Predicted Values", ylab = "Standardized Residuals")
# abline(h = 2, lty = 2)
# abline(h = -2, lty = 2)
# identify(bondsmod1$fitted.values, rstandard(bondsmod1))

# identified points are 4 33 34
bonds_new1<-bonds_new[-34,]
# bondsmod2<-lm(BidPrice~CouponRate, data = bonds_new1)
# summary(bondsmod2)
# plot(bondsmod2$fitted.values, rstandard(bondsmod2), main = "Residual Plot", xlab = "Predicted Values", ylab = "Standardized Residuals")
# abline(h = 2, lty = 2)
# abline(h = -2, lty = 2)
# identify(bondsmod2$fitted.values, rstandard(bondsmod2))

# identified points are 13 34
# bonds_new2<-bonds_new1[-34,]
# bondsmod3<-lm(BidPrice~CouponRate, data = bonds_new2)
# summary(bondsmod3)
# plot(bondsmod3$fitted.values, rstandard(bondsmod3), main = "Residual Plot", xlab = "Predicted Values", ylab = "Standardized Residuals")
# abline(h = 2, lty = 2)
# abline(h = -2, lty = 2)
# identify(bondsmod3$fitted.values, rstandard(bondsmod3))

# identified points are 4 13
# bonds_new3<-bonds_new2[-13,]
# bondsmod4<-lm(BidPrice~CouponRate, data = bonds_new3)
# summary(bondsmod4)
# plot(bondsmod4$fitted.values, rstandard(bondsmod4), main = "Residual Plot", xlab = "Predicted Values", ylab = "Standardized Residuals")
# abline(h = 2, lty = 2)
# abline(h = -2, lty = 2)
# identify(bondsmod4$fitted.values, rstandard(bondsmod4))

# identified points are 4
bonds_new4<-bonds_new1[-4,]
# bondsmod5<-lm(BidPrice~CouponRate, data = bonds_new4)
# summary(bondsmod5)
# plot(bondsmod5$fitted.values, rstandard(bondsmod5), main = "Residual Plot", xlab = "Predicted Values", ylab = "Standardized Residuals")
# abline(h = 2, lty = 2)
# abline(h = -2, lty = 2)
# identify(bondsmod5$fitted.values, rstandard(bondsmod5))

bonds_mod<-lm(BidPrice~CouponRate, data = bonds_new4)
summary(bonds_mod)
plot(bonds_new4$CouponRate, bonds_new4$BidPrice, main = "Bid Price vs Coupon Rate", xlab = "Coupon Rate", ylab = "Bid Price")
