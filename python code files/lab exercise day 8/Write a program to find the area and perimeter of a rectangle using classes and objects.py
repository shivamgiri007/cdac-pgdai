"""12: Write a program to find the area and perimeter of a rectangle using classes and objects.
Program output should be like this:"""

class AreaPeri:
    def __init__(self):
        self.Length = int(input("Enter the Length of Rectangle: "))
        self.Breadth = int(input("Enter the Breadth of Rectangle: "))
        
    def menu(self):
        while True:
            print("""\n1. Area
2. Perimeter
3. Exit""")
            a = int(input("Enter your choice: "))
            if a == 1:
                print("The Area of the rectangle is:", self.Length * self.Breadth)
            elif a == 2:
                print("The Perimeter of the rectangle with length", self.Length, "and breadth", self.Breadth, "is", 2 * (self.Length + self.Breadth))
            elif a == 3:
                print("Exiting the program.")
                break
            else:
                print("Invalid choice. Please try again.")


rectangle = AreaPeri()
rectangle.menu()
 
        
