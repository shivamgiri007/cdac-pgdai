"""4. Write a program to implement following.
Create a base class named person consisting of name and code. Create 2 child
classes

a) Account with member_pay
b) Admin with experience and inherit the base class.

Create a class employee with name, code, experience and pay by inheriting the
above classes."""
"""
class Person:
    def __init__(self, name, code):
        self.name = name  
        self.code = code  

    def display_info(self):
        return ("Name: ",self.name," Code: ",self.code)


class Account(Person):
    def __init__(self, name, code, pay):
        super().__init__(self,name, code)  
        self.pay = pay  

    def display_account_info(self):
        return (self.display_info()," Pay: ",self.pay)


class Admin(Person):
    def __init__(self, name, code, experience):
        super().__init__(self,name, code)  
        self.experience = experience  

    def display_admin_info(self):
        return (self.display_info()," Experience: ",self.experience ," years")


class Employee(Account, Admin):
    def __init__(self, name, code, pay, experience):
        Account.__init__(self, name, code, pay)  
        Admin.__init__(self, name, code, experience)

    def display_employee_info(self):
        return (self.display_account_info()," Experience: ",self.experience ," years")



if __name__ == "__main__":
    emp = Employee("John Doe", "E123", 50000, 5)
    print(emp.display_employee_info())
"""
class Person:
    def __init__(self, name, code):
        self.name = name  
        self.code = code  

    def display_info(self):
        return "Name: "+str(self.name)+" Code: "+str(self.code)


class Account(Person):
    def __init__(self, name, code, pay):
        Person.__init__(self,name, code)  
        self.pay = pay  

    def display_account_info(self):
        return self.display_info() +" Pay: "+str(self.pay)


class Admin(Person):
    def __init__(self, name, code, experience):
        Person.__init__(self,name, code)  
        self.experience = experience  

    def display_admin_info(self):
        return self.display_info()+" Experience: "+str(self.experience) +" years"


class Employee(Account, Admin):
    def __init__(self, name, code, pay, experience):
        Account.__init__(self, name, code, pay)  
        Admin.__init__(self, name, code, experience)

    def display_employee_info(self):
        return self.display_account_info()+" Experience: "+str(self.experience) +" years"



if __name__ == "__main__":
    emp = Employee("John Doe", "E123", 50000, 5)
    print(emp.display_employee_info())
