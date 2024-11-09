import java.util.ArrayList;
import java.util.List;

public class Student {
    private String name;
    private String studentId;
    private List<Course> enrolledCourses; // Changed to Course for consistency
    private Department department;

    public Student(String name, String studentId, Department department) {
        this.name = name;
        this.studentId = studentId;
        this.enrolledCourses = new ArrayList<>();
        this.department = department;
    }

    public void setEnrolledCourses(Course course) {
        enrolledCourses.add(course);
    }

    public void displayInfo() {
        System.out.println("Student Name: " + name);
        System.out.println("Student ID: " + studentId);
        System.out.println("Department: " + department.getDepartmentName());
        System.out.println("Enrolled Courses: ");
        for (Course course : enrolledCourses) {
            System.out.println("_" + course.getCourseName());
        }
    }

    public void enrollCourse(Course course) {
        if (course != null) {
            setEnrolledCourses(course); // Reuse the method to add the course
        } else {
            System.out.println("Cannot enroll in a null course.");
        }
    }
}