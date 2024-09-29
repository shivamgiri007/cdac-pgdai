"""Q6: Write a python program to create user-defined exception"""

class NegativeNumberError(Exception):
    def __init__(self,num):
        self.num = num
        self.msg = "The value "+str(num)+" is negative value"
        super().__init__(self.msg)

def checkPositive(value):
    try:
        if(value<0):
            raise NegativeNumberError(value)
    except Exception as e :
        print(e)

    else:
        print("No exception Occured The ",value," is positive." )


checkPositive(5)
checkPositive(-6)
