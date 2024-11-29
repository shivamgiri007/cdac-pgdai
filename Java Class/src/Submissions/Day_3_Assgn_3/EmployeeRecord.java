package Submissions.Day_3_Assgn_3;
import java.util.Scanner;
import java.util.Comparator;
//
//Q 7 wap to ask 6 employee record from  user using get and display method show record on console 
//after performing sorting on record on basis of employee id.
class EmployeeRecord {
    private String name;
    private int empId;

    // Constructor
    public EmployeeRecord(String name, int empId) {
        this.name = name;
        this.empId = empId;
    }

    // Getters
    public String getName() {
        return name;
    }

    public int getEmpId() {
        return empId;
    }

    // Method to display employee details
    public void display() {
        System.out.println("Employee ID: " + empId + ", Name: " + name);
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        EmployeeRecord[] employees = new EmployeeRecord[6];

        // Input employee records
        for (int i = 0; i < 6; i++) {
            System.out.print("Enter name of employee " + (i + 1) + ": ");
            String name = scanner.nextLine();
            System.out.print("Enter employee ID of employee " + (i + 1) + ": ");
            int empId = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character
            employees[i] = new EmployeeRecord(name, empId);
        }

     // Sort employees using bubble sort based on employee ID
        for (int i = 0; i < employees.length - 1; i++) {
            for (int j = 0; j < employees.length - 1 - i; j++) {
                if (employees[j].getEmpId() > employees[j + 1].getEmpId()) {
                    // Swap employees[j] and employees[j + 1]
                    EmployeeRecord temp = employees[j];
                    employees[j] = employees[j + 1];
                    employees[j + 1] = temp;
                }
            }
        }

        // Display sorted employee records
        System.out.println("\nSorted Employee Records:");
        for (EmployeeRecord employee : employees) {
            employee.display();
        }

        scanner.close();
    }
}
