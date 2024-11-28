package Submissions.Day_4_Exception_handling;
//Package declaration (optional, can be omitted if not using packages)
//Custom exception for exceeding internal marks
//Q 3 	Write a program for user defined Exception that checks the external and internal marks 
//if the internal marks is greater than 40 it raise the exception internal mark is exceed, 
//if the external mark is greater than 60 exception is raised and display the message the external marks is exceed, 
//create the above exception and use it in your program.

class InternalMarksExceededException extends Exception {
 InternalMarksExceededException() {
     super("Internal marks exceed the limit of 40.");
 }
}

//Custom exception for exceeding external marks
class ExternalMarksExceededException extends Exception {
 ExternalMarksExceededException() {
     super("External marks exceed the limit of 60.");
 }
}

//Class to check marks
class MarksChecker {
 void checkMarks(int internalMarks, int externalMarks) throws InternalMarksExceededException, ExternalMarksExceededException {
     if (internalMarks > 40) {
         throw new InternalMarksExceededException();
     }
     if (externalMarks > 60) {
         throw new ExternalMarksExceededException();
     }
 }
}

//Main class to run the program
public class UserDefinedExceptionMarksExtended {
 public static void main(String[] args) {
     MarksChecker marksChecker = new MarksChecker();
     
     // Example marks to test
     int internalMarks = 45; // Change this value to test different scenarios
     int externalMarks = 65; // Change this value to test different scenarios
     
     try {
         marksChecker.checkMarks(internalMarks, externalMarks);
         System.out.println("Marks are within the acceptable limits.");
     } catch (InternalMarksExceededException | ExternalMarksExceededException e) {
         System.out.println(e.getMessage());
     }
 }
}
