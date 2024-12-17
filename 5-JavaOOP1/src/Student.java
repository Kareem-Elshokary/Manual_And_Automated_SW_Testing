public class Student {

    /*
    * Plain Old Java Object (POJO) :
    * It's a straightforward class that encapsulates data and provides methods to access and modify that data.
    * */

    //Fields
    private String studentName;
    private String studentDOB;
    private String studentCourses;
    private int studentID;

    public Student(){
        this("defaultName", "defoultDOB", "Empty", 0);
    }
    public Student(String studentName, String studentDOB, String studentCourses, int studentID) {
        this.studentName = studentName;
        this.studentDOB = studentDOB;
        this.studentCourses = studentCourses;
        this.studentID = studentID;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentName='" + studentName + '\'' +
                ", studentDOB='" + studentDOB + '\'' +
                ", studentCourses='" + studentCourses + '\'' +
                ", studentID=" + studentID +
                '}';
    }

    public String getStudentName() {
        return studentName;
    }
    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentDOB() {
        return studentDOB;
    }
    public void setStudentDOB(String studentDOB) {
        this.studentDOB = studentDOB;
    }

    public String getStudentCourses() {
        return studentCourses;
    }
    public void setStudentCourses(String studentCourses) {
        this.studentCourses = studentCourses;
    }

    public int getStudentID() {
        return studentID;
    }
    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

}
