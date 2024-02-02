import numpy
from sklearn.linear_model import LinearRegression

x=numpy.array([12,3,4,5,6]).reshape((-1,1))
y=numpy.array([12,4,5,6,7,4])
x
y

model=LinearRegression()
model.fit(x,y)
model=LinearRegression().fit(x,y)
r_sq=model.score(x,y)
print(f"coeffcient if dernubatuib:{r_sq}")
new_model=LinearRegression().fit(x,y.reshape((-1,1)))
print(f"intercept: {new_model.intercept_}")
print(f"slope:{new_model.coef_}")
y_pred=model.intercept_+model.coef_*x
print(f"predicted response:\n{y_pred}")



