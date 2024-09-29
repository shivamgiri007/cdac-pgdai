"""Q10: Write a python program to raise a TypeError if x is not an integer:"""

def check_integer(x):
    if not isinstance(x, int):
        raise TypeError(str(x) + " is not a int type.")
    else:
        print(str(x)+" in of int type.")

try:
    check_integer(3.5) 
except TypeError as e:
    print(e)
