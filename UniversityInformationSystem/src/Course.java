public class Course {
    private String courseName;
    private String courseCode;
    private Department department;

    public Course(String courseName, String courseCode, Department department){
        this.courseName = courseName;
        this.courseCode = courseCode;
        this.department = department;
    }

    public String getCourseName() {
        return courseName;
    }

    public String getCourseCode() {
        return courseCode;
    }

    public Department getDepartment() {
        return department;
    }
}
