class EmployeeProfile {
    String empId;
    String name;
    String department;

    public EmployeeProfile(String empId, String name, String department) {
        this.empId = empId;
        this.name = name;
        this.department = department;
    }

    public void displayProfile() {
        System.out.printf("ID: %s | Name: %s | Dept: %s\n", empId, name, department);
    }
}

public class EmployeeProfileCreation {
    public static void main(String[] args) {
        EmployeeProfile emp = new EmployeeProfile("E101", "Bob Smith", "Engineering");
        emp.displayProfile();
    }
}
