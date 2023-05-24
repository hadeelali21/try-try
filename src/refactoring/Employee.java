
package refactoring;


public class Employee {
    public String  employeeName;
    public String empEmail;
    public int employeeID; 

    public Employee(String employeeName, String empEmail, int employeeID) {
        this.employeeName = employeeName;
        this.empEmail = empEmail;
        this.employeeID = employeeID;
    }

    public Employee() {
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getEmpEmail() {
        return empEmail;
    }

    public void setEmpEmail(String empEmail) {
        this.empEmail = empEmail;
    }

    public int getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(int employeeID) {
        this.employeeID = employeeID;
    }
    
}
