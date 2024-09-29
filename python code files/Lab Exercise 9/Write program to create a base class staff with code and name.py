"""5. Write program to create a base class staff with code and name. Derive
classes teacher(subject , publication) , typist (speed) , officer (grade) .
Using the typist class as base class,create two classes regular(salary) and
casual(daily wages).Implement a
menu driven program for the same.

Output:
1. Teacher
2. Officer,
3. Regular Typist
4. Casaul typist
5. Exit
"""

class staff:
    def __init__(self, code, name):
        self.code = code
        self.name = name

    def display_info(self):
        return "Code: " + str(self.code) + " Name: " + str(self.name)

class teacher(staff):
    def __init__(self, code, name, subject, publication):
        super().__init__(code, name)
        self.subject = subject
        self.publication = publication

    def display_info(self):
        return super().display_info() + " Subject: " + str(self.subject) + " Publication: " + str(self.publication)

class officer(staff):
    def __init__(self, code, name, grade):
        super().__init__(code, name)
        self.grade = grade

    def display_info(self):
        return super().display_info() + " Grade: " + str(self.grade)

class typist(staff):
    def __init__(self, code, name, speed):
        super().__init__(code, name)
        self.speed = speed

    def display_info(self):
        return super().display_info() + " Typing Speed: " + str(self.speed) + " wpm"

class regular_typist(typist):
    def __init__(self, code, name, speed, salary):
        super().__init__(code, name, speed)
        self.salary = salary

    def display_info(self):
        return super().display_info() + " Salary: " + str(self.salary)

class casual_typist(typist):
    def __init__(self, code, name, speed, daily_wages):
        super().__init__(code, name, speed)
        self.daily_wages = daily_wages

    def display_info(self):
        return super().display_info() + " Daily Wages: " + str(self.daily_wages)

def print_menu():
    print("\nMenu:")
    print("1. Teacher")
    print("2. Officer")
    print("3. Regular Typist")
    print("4. Casual Typist")
    print("5. Exit")

def main():
    while True:
        print_menu()
        choice = int(input("Enter your choice (1-5): "))

        if choice == 1:
            code = input("Enter teacher code: ")
            name = input("Enter teacher name: ")
            subject = input("Enter subject: ")
            publication = input("Enter publication: ")
            teacher1 = teacher(code, name, subject, publication)
            print(teacher1.display_info())

        elif choice == 2:
            code = input("Enter officer code: ")
            name = input("Enter officer name: ")
            grade = input("Enter grade: ")
            officer1 = officer(code, name, grade)
            print(officer1.display_info())

        elif choice == 3:
            code = input("Enter typist code: ")
            name = input("Enter typist name: ")
            speed = int(input("Enter typing speed (wpm): "))
            salary = float(input("Enter salary: "))
            regular_typist1 = regular_typist(code, name, speed, salary)
            print(regular_typist1.display_info())

        elif choice == 4:
            code = input("Enter typist code: ")
            name = input("Enter typist name: ")
            speed = int(input("Enter typing speed (wpm): "))
            daily_wages = float(input("Enter daily wages: "))
            casual_typist1 = casual_typist(code, name, speed, daily_wages)
            print(casual_typist1.display_info())

        elif choice == 5:
            print("Exiting the program.")
            break

        else:
            print("Invalid choice. Please try again.")

if __name__ == "__main__":
    main()
