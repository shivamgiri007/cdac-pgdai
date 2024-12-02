package Submissions.Day_6_Collectioss_and_GetterSetter;

import org.xml.sax.ext.Attributes2;
import java.util.*;

//Q 1  Wap to define Student class havinf fields like   Rollno , name and marks
//--define    - constructor  |getter Setter
//
//Q 2 Create another class MyRollnoComparator  and override compare method
//Q 3 Create MainClass and define 5 objects of student class  and store them in TreeSet or Priority Queue

class Student{
	int RollNo;
	String name ;
	int marks;
	public Student(int rollNo, String name, int marks) {
		super();
		RollNo = rollNo;
		this.name = name;
		this.marks = marks;
	}
	public int getRollNo() {
		return RollNo;
	}
	public String getName() {
		return name;
	}
	public int getMarks() {
		return marks;
	}
	public void setRollNo(int rollNo) {
		RollNo = rollNo;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
}

class MyRollnoComparator implements Comparator<Student>{
	@Override
	public int compare(Student s1 , Student s2) {
		return s1.getName().compareTo(s2.getName());
	}
}
public class getterSetter {
	public static void main(String[] args) {
		Student s1 = new Student(1,"shivam",50);
		Student s2 = new Student(2,"suyash",60);
		Student s3 = new Student(3,"vikas",70);
		Student s4 = new Student(4,"balasaheb",80);
		Student s5 = new Student(5,"siddhu",90);
		Set<Student> s = new TreeSet<>(new MyRollnoComparator());
		s.add(s1);
		s.add(s2);
		s.add(s3);
		s.add(s4);
		s.add(s5);
		for(Student sn : s) {
			System.out.println(sn.getRollNo()+sn.getName()+sn.getMarks());
		}
	}

}
