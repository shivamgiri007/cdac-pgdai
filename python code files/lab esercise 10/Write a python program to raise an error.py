"""Q9: Write a python program to raise an error and stop the program
if x is lower than 0."""

def check_value(x):
    if x < 0:
        raise ValueError(x," is smaller than 0.")
    else:
        print(x," is greater than 0.")


try:
    check_value(-1)  
except ValueError as e:
    print(e)
