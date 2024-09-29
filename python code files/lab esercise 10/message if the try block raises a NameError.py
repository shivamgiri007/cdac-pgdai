"""Q7: Print one message if the try block raises a NameError and another for
other errors:"""

def check_errors():
    try:
        print(undefined_variable)
    except NameError:
        print("A NameError occurred: The variable is not defined.")
    except Exception as e:
        print("An error occurred:", e)

check_errors()
