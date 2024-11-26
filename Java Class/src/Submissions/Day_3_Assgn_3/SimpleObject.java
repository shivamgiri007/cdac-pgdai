package Submissions.Day_3_Assgn_3;
//Q4 Write a program create a class ‘simpleobject‘. Using constructor display the message.
class SimpleObject {
    // Constructor
    public SimpleObject() {
        // Display a message when an object is created
        System.out.println("A SimpleObject has been created!");
    }

    // Main method to demonstrate the SimpleObject class
    public static void main(String[] args) {
        // Create an instance of SimpleObject
        SimpleObject obj = new SimpleObject();
    }
}