class Company {
    static String companyName = "TechCorp";
    static String location = "New York";
}

class CompanyEmployee {
    String name;
    String role;

    public CompanyEmployee(String name, String role) {
        this.name = name;
        this.role = role;
    }

    public void displayInfo() {
        System.out.printf("Employee: %s | Role: %s | Company: %s (%s)\n", name, role, Company.companyName, Company.location);
    }
}

public class EmployeeCompanyInfo {
    public static void main(String[] args) {
        CompanyEmployee emp1 = new CompanyEmployee("Dave", "Developer");
        CompanyEmployee emp2 = new CompanyEmployee("Eve", "Manager");
        emp1.displayInfo();
        emp2.displayInfo();
    }
}
