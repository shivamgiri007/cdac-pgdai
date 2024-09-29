"""Q 4: Write a Python Program to depict else clause with try-except"""

def try_except_else():
    try:
        result = 5 / 2
    except ZeroDivisionError as e:
        print("Exception occurred:", e)
    else:
        print("No exception occurred. The result is:", result)


try_except_else()
