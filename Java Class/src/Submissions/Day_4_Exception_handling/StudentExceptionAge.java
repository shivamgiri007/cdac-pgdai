package Submissions.Day_4_Exception_handling;
//Custom exception for age not within range
//Q 4      Create a class Student with attributes roll no, name, age and course. 
//Initialize values through parameterized constructor. 
//If age of student is not in between 15 and 21 then generate user-defined exception “AgeNotWithinRangeException”. 
//If name contains numbers or special symbols raise exception” NameNotValidException ”.
class AgeNotWithinRangeException extends Exception {
 AgeNotWithinRangeException() {
     super("Age is not within the range of 15 to 21.");
 }
}

//Custom exception for invalid name
class NameNotValidException extends Exception {
 NameNotValidException() {
     super("Name contains invalid characters (numbers or special symbols).");
 }
}

//Student class
class Student {
 private int rollNo;
 private String name;
 private int age;
 private String course;

 // Parameterized constructor
 public Student(int rollNo, String name, int age, String course) throws AgeNotWithinRangeException, NameNotValidException {
     if (age < 15 || age > 21) {
         throw new AgeNotWithinRangeException();
     }
     if (!isValidName(name)) {
         throw new NameNotValidException();
     }
     this.rollNo = rollNo;
     this.name = name;
     this.age = age;
     this.course = course;
 }

 // Method to validate name
 private boolean isValidName(String name) {
     return name.matches("[a-zA-Z ]+"); // Only allows letters and spaces
 }

 // Method to display student details
 public void displayDetails() {
     System.out.println("Roll No: " + rollNo);
     System.out.println("Name: " + name);
     System.out.println("Age: " + age);
     System.out.println("Course: " + course);
 }
}

//Main class to run the program
public class StudentExceptionAge {
 public static void main(String[] args) {
     try {
         // Example of creating a valid student
         Student student1 = new Student(1, "John Doe", 20, "Computer Science");
         student1.displayDetails();

         // Example of creating a student with invalid age
         Student student2 = new Student(2, "Jane Doe", 22, "Mathematics"); // This will throw an exception

         // Example of creating a student with invalid name
         Student student3 = new Student(3, "John123", 19, "Physics"); // This will throw an exception

     } catch (AgeNotWithinRangeException | NameNotValidException e) {
         System.out.println(e.getMessage());
     }
 }
}
	