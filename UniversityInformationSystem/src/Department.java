public class Department {
    private String departmentName;
    private Professor headOfDepartment;

    public Department(String departmentName, Professor headOfDepartment){
        this.departmentName = departmentName;
        this.headOfDepartment = headOfDepartment;
    }
    public String getDepartmentName(){
        return departmentName;
    }

    public Professor getHeadOfDepartment() {
        return headOfDepartment;
    }
}
