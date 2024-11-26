package Submissions.Day_3_Assgn_3;
//Q 6  Create a class named 'StudentRecord' with String variable 'sname' and integer variable 'roll_no'.
//Assign the value of roll_no as '2' and that of name as "John" while creating an object of the class Student.
//and using display method show all values on console
class StudentRecord {
    // Data members
    private String sname;
    private int roll_no;

    // Constructor to initialize the student record
    public StudentRecord(String sname, int roll_no) {
        this.sname = sname;
        this.roll_no = roll_no;
    }

    // Method to display the student record
    public void display() {
        System.out.println("Student Name: " + sname);
        System.out.println("Roll Number: " + roll_no);
    }

    // Main method to demonstrate the StudentRecord class
    public static void main(String[] args) {
        // Create an object of StudentRecord with roll_no as 2 and sname as "John"
        StudentRecord student = new StudentRecord("John", 2);

        // Display the student record
        student.display();
    }
}
