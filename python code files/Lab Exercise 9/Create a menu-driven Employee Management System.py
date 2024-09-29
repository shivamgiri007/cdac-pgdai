"""Create a menu-driven Employee Management System using Python classes and objects. 
The system will allow the user to: 
1. Add new employees with details. 
2. View all employees. 
3. Update employee information. 
4. Delete an employee record. 
5. Exit the program. 
Output should display a menu like this: 
Employee Management System 
1. Add Employee 
2. View All Employees 
3. Update Employee Information 
4. Delete Employee 
5. Exit Enter your choice (1-5):"""

class Employee:
    def __init__(self, emp_id, name, position):
        self.emp_id = emp_id  
        self.name = name  
        self.position = position  

    def __str__(self):
        return f"ID: {self.emp_id}, Name: {self.name}, Position: {self.position}"


class EmployeeManagementSystem:
    def __init__(self):
        self.employees = []  

    def add_employee(self, emp_id, name, position):
            new_employee = Employee(emp_id, name, position)
            self.employees.append(new_employee)
            print("Employee ",name," added successfully.")
    def view_employees(self):
        if not self.employees:
            print("No employees found.")
        else:
            print("Employees:")
            for emp in self.employees:
                print(emp)

    def update_employee(self, emp_id, name=None, position=None):
        for emp in self.employees:
            if emp.emp_id == emp_id:
                if name:
                    emp.name = name
                if position:
                    emp.position = position
                print("Employee ID ",emp_id," updated successfully.")
                return
        print("Employee ID ",emp_id," not found.")

    def delete_employee(self, emp_id):
        for emp in self.employees:
            if emp.emp_id == emp_id:
                self.employees.remove(emp)
                print("Employee ID ",emp_id," deleted successfully.")
                return
        print("Employee ID ",emp_id," not found.")


def print_menu():
    print("\nEmployee Management System")
    print("1. Add Employee")
    print("2. View All Employees")
    print("3. Update Employee Information")
    print("4. Delete Employee")
    print("5. Exit")


def main():
    ems = EmployeeManagementSystem()

    while True:
        print_menu() 
        choice = int(input("Enter your choice (1-5): "))

        if choice == 1:
            emp_id = input("Enter employee ID: ")
            name = input("Enter employee name: ")
            position = input("Enter employee position: ")
            ems.add_employee(emp_id, name, position)

        elif choice == 2:
            ems.view_employees()

        elif choice == 3:
            emp_id = input("Enter employee ID to update: ")
            name = input("Enter new name (leave blank to keep current): ")
            position = input("Enter new position (leave blank to keep current): ")
            ems.update_employee(emp_id, name if name else None, position if position else None)

        elif choice == 4:
            emp_id = input("Enter employee ID to delete: ")
            ems.delete_employee(emp_id)

        elif choice == 5:
            print("Exiting the program.")
            break

        else:
            print("Invalid choice. Please try again.")

if __name__ == "__main__":
    main()
