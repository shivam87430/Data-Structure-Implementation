package queues;

public class Employee {
    private String firstName;
    private String secondName;
    private int employeeId;

    public Employee(String firstName,String secondName,int employeeId){
        this.firstName=firstName;
        this.secondName=secondName;
        this.employeeId=employeeId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "firstName='" + firstName + '\'' +
                ", secondName='" + secondName + '\'' +
                ", employeeId=" + employeeId +
                '}';
    }
}
