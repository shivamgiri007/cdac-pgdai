"""11: Write a Python class which has two methods get_String and print_String.
get_String accept a string from the user and print_String print
the string in upper case."""

class upperString:
    def __init__(self):
        self.string = ""
    def get_string(self):
        self.string = input("Enter your string :")
    def print_string(self):
        print((self.string.upper()))

n1 = upperString()
n1.get_string()
n1.print_string()
    
