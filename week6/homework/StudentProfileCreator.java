class StudentProfile {
    String rollNo;
    String name;
    String branch;

    public StudentProfile(String rollNo, String name, String branch) {
        this.rollNo = rollNo;
        this.name = name;
        this.branch = branch;
    }

    public void displayProfile() {
        System.out.printf("Roll No: %s | Name: %s | Branch: %s\n", rollNo, name, branch);
    }
}

public class StudentProfileCreator {
    public static void main(String[] args) {
        StudentProfile s = new StudentProfile("RA22110030101", "Aarav Sharma", "CSE");
        s.displayProfile();
    }
}
