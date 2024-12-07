package Submissions.day_8_Associations;
import java.util.ArrayList;
import java.util.List;

class Employee {
    private String name;
    private int id;

    public Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Employee ID: " + id + ", Name: " + name;
    }
}

class Department {
    private String departmentName;
    private List<Employee> employees;

    public Department(String departmentName) {
        this.departmentName = departmentName;
        this.employees = new ArrayList<>();
    }

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    @Override
    public String toString() {
        return "Department: " + departmentName + ", Employees: " + employees;
    }
}

public class oneToMany {
	    public static void main(String[] args) {
	        Department department = new Department("Human Resources");

	        Employee emp1 = new Employee("Alice", 101);
	        Employee emp2 = new Employee("Bob", 102);
	        Employee emp3 = new Employee("Charlie", 103);

	        department.addEmployee(emp1);
	        department.addEmployee(emp2);
	        department.addEmployee(emp3);

	        System.out.println(department);
	        System.out.println("Employees in " + department.getDepartmentName() + ":");
	        for (Employee employee : department.getEmployees()) {
	            System.out.println(employee);
	        }
	    }
	

}
