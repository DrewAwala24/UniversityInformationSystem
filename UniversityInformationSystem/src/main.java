public class main {
    public static void main(String[ ]args){
        //Create professors
        Professor prof1 = new Professor("Mr. Jii", "P001");
        Professor prof2 = new Professor("Dr.Charlton", "P002");
        Professor prof3 = new Professor("Mrs.Anastasia", "P003");
        Professor prof4 = new Professor("Mr.Frank","P004");

        //Create departments
        Department itDepartment = new Department("Information Tech",prof1);
        Department lsDepartment = new Department("Land Survey",prof2);
        Department eeDepartment = new Department("Electrical Engineering",prof3);
        Department ceDepartment = new Department("Civil Engineering", prof4);

        //Create courses
        Course course1 = new Course("Computer Science","CS101",itDepartment);
        Course course2 = new Course("Cartography","LS201",lsDepartment);
        Course course3 = new Course("Technical Drawing","EE301",eeDepartment);
        Course course4 = new Course("Architecture","ce401",ceDepartment);

        //create students
        Student student1 = new Student("Trevor Omondi","SID001",itDepartment);
        Student student2 = new Student("Roronoa Zoro","SID002",lsDepartment);
        Student student3 = new Student("Eugene Isambe","SID003",eeDepartment);
        Student student4 = new Student("jacob Desviaux","SID004",ceDepartment);

        //Enroll students in courses
        student1.enrollCourse(course1);
        student2.enrollCourse(course2);
        student3.enrollCourse(course3);
        student4.enrollCourse(course4);

        //Create hostels
        hostel hostel1 = new hostel("Ruwenzori",250);
        hostel hostel2 = new hostel("Danakil", 150);
        hostel hostel3 = new hostel("North Pole",90);
        hostel hostel4 = new hostel("Vatican",100);

        //Display student information
        student1.displayInfo();
        System.out.println();
        student2.displayInfo();
        System.out.println();
        student3.displayInfo();
        System.out.println();
        student4.displayInfo();
        System.out.println();
    }
}
