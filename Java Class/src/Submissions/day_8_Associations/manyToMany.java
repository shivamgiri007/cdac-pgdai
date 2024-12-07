package Submissions.day_8_Associations;
import java.util.ArrayList;
import java.util.List;

class Student {
    private String name;
    private int id;
    private List<Course> courses;

    public Student(String name, int id) {
        this.name = name;
        this.id = id;
        this.courses = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public void enrollInCourse(Course course) {
        courses.add(course);
        course.addStudent(this); // Ensure the course also knows about this student
    }

    public List<Course> getCourses() {
        return courses;
    }

    @Override
    public String toString() {
        return "Student ID: " + id + ", Name: " + name;
    }
}

class Course {
    private String courseName;
    private List<Student> students;

    public Course(String courseName) {
        this.courseName = courseName;
        this.students = new ArrayList<>();
    }

    public String getCourseName() {
        return courseName;
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public List<Student> getStudents() {
        return students;
    }

    @Override
    public String toString() {
        return "Course: " + courseName + ", Students: " + students;
    }
}


public class manyToMany {
	    public static void main(String[] args) {
	        Student student1 = new Student("Alice", 1);
	        Student student2 = new Student("Bob", 2);
	        Student student3 = new Student("Charlie", 3);

	        Course course1 = new Course("Mathematics");
	        Course course2 = new Course("Physics");
	        Course course3 = new Course("Chemistry");

	        // Enroll students in courses
	        student1.enrollInCourse(course1);
	        student1.enrollInCourse(course2);
	        student2.enrollInCourse(course2);
	        student2.enrollInCourse(course3);
	        student3.enrollInCourse(course1);
	        student3.enrollInCourse(course3);

	        // Print course details
	        System.out.println(course1);
	        System.out.println(course2);
	        System.out.println(course3);

	        // Print student details
	        System.out.println("Students enrolled in courses:");
	        System.out.println(student1);
	        System.out.println(student2);
	        System.out.println(student3);
	    }
}
