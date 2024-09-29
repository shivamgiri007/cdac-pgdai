"""Q 3: Write a Python Program to handle multiple errors with one except
statement"""

def handle_multiple_errors():
    try:
        arr = [1, 2, 3]
        result = 5 / 0  #Exception
        element = arr[5]  #Exception
    except (ZeroDivisionError, IndexError) as e:
        print("The first occured exception is : ", e)

handle_multiple_errors()
