/*
 Hadeel
 */
package refactoring;


public class Student {
     public String studentName; 
    public String studentEmail;
     public int studentID;

    public Student() {
    }

    public Student(String studentName, String studentEmail, int studentID) {
        this.studentName = studentName;
        this.studentEmail = studentEmail;
        this.studentID = studentID;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentEmail() {
        return studentEmail;
    }

    public void setStudentEmail(String studentEmail) {
        this.studentEmail = studentEmail;
    }

    public int getStudentID() {
        return studentID;
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

}