"""Q5: Write a Python Program to depict Raising Exception"""


def check_positive_number(number):
    try:
        if number < 0:
            raise Exception("The number must be positive.")
    except Exception as e:
        print("Exception occurred:", e)
    else:
        print("The number is positive:", number)

check_positive_number(-5)
check_positive_number(10)
