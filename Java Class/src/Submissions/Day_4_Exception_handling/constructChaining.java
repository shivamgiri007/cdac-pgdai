package Submissions.Day_4_Exception_handling;
//Class to demonstrate constructor chaining
class Person {
 private String name;
 private int age;
 private String address;

 // Constructor with all parameters
 public Person(String name, int age, String address) {
     this.name = name;
     this.age = age;
     this.address = address;
     System.out.println("Constructor with all parameters called.");
 }

 // Constructor with name and age, calls the full constructor
 public Person(String name, int age) {
     this(name, age, "Unknown"); // Default address
     System.out.println("Constructor with name and age called.");
 }

 // Constructor with only name, calls the two-parameter constructor
 public Person(String name) {
     this(name, 0); // Default age
     System.out.println("Constructor with name called.");
 }

 // Method to display person details
 public void displayInfo() {
     System.out.println("Name: " + name);
     System.out.println("Age: " + age);
     System.out.println("Address: " + address);
 }
}

//Main class to test the Person class
class constructChaining {
 public static void main(String[] args) {
     // Creating objects using different constructors
     Person person1 = new Person("Alice", 30, "123 Main St");
     person1.displayInfo();
     System.out.println();

     Person person2 = new Person("Bob", 25);
     person2.displayInfo();
     System.out.println();

     Person person3 = new Person("Charlie");
     person3.displayInfo();
 }
}


