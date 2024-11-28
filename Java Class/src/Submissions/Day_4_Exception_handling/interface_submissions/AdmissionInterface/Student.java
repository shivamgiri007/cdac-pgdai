package Submissions.Day_4_Exception_handling.interface_submissions.AdmissionInterface;

//Student.java
public class Student {
 
 public void AddStudent() {
     // Local class MtechStudent that implements Admission interface
     class MtechStudent implements Admission {
         @Override
         public void registration() {
             System.out.println("Mtech Student registered successfully.");
         }
     }

     // Create an instance of the local class
     MtechStudent mtechStudent = new MtechStudent();
     mtechStudent.registration();

     // Anonymous class that also implements Admission interface
     Admission anonymousStudent = new Admission() {
         @Override
         public void registration() {
             System.out.println("Anonymous Student registered successfully.");
         }
     };

     // Call the registration method of the anonymous class
     anonymousStudent.registration();
 }
}
