package Submissions.Day_3_Assgn_3;
//Q 1 WAP using parameterized constructor with two parameters id and name. While creating the objects obj1 and obj2
//passed two arguments so that this constructor gets invoked after creation of obj1 and obj2
class Student {
    private int id;
    private String name;

    // Parameterized constructor
    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    // Method to display student details
    public void display() {
        System.out.println("Student ID: " + id + ", Name: " + name);
    }
}

public class q1_constructor_call {
	    public static void main(String[] args) {
	        // Creating objects and passing parameters to the constructor
	        Student obj1 = new Student(1, "Alice");
	        Student obj2 = new Student(2, "Bob");

	        // Displaying the details of the students
	        obj1.display();
	        obj2.display();
	    }
	}



