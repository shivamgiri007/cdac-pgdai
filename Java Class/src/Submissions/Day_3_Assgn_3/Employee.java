package ClassSolutions.Day_3_Assgn_3;
//Q 2 Write a program by creating an 'Employee' class having the following methods and print the final salary.
//1 - 'getInfo()' which takes the salary, number of hours of work per day of employee as parameter
//2 - 'AddSal()' which adds 10000 to salary of the employee if it is less than 50000.
//3 - 'AddWork()' which adds 5000 to salary of employee if the number of hours of work per day is more than 6 hours.

class Employee {
    private double salary;
    private int hoursOfWorkPerDay;

    // Method to get employee information
    public void getInfo(double salary, int hoursOfWorkPerDay) {
        this.salary = salary;
        System.out.println("salary is : " +  salary);
        this.hoursOfWorkPerDay = hoursOfWorkPerDay;
        System.out.println("working hour per day is : "+hoursOfWorkPerDay);
    }

    // Method to add salary if it is less than 50000
    public void AddSal() {
        if (salary < 50000) {
            salary += 10000;
        }
    }

    // Method to add salary if hours of work per day is more than 6
    public void AddWork() {
        if (hoursOfWorkPerDay > 6) {
            salary += 5000;
        }
    }

    // Method to display the final salary
    public void displayFinalSalary() {
        System.out.println("Final Salary: " + salary);
    }

 public static void main(String[] args) {
        Employee emp = new Employee();

        // Setting employee information
        emp.getInfo(45000, 7); // Example salary and hours of work

        // Adding salary based on conditions
        emp.AddSal();
        emp.AddWork();

        // Displaying the final salary
        emp.displayFinalSalary();
    }

}
