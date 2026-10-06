class College {
    static String collegeName = "SRM Institute of Science and Technology";
    static String campus = "Kattankulathur";
}

class CollegeStudent {
    String name;
    String regNo;

    public CollegeStudent(String name, String regNo) {
        this.name = name;
        this.regNo = regNo;
    }

    public void displayDetails() {
        System.out.printf("Student: %s | Reg No: %s | College: %s, Campus: %s\n", name, regNo, College.collegeName, College.campus);
    }
}

public class StudentCollegeInfo {
    public static void main(String[] args) {
        CollegeStudent s1 = new CollegeStudent("Rohan", "RA211100301");
        s1.displayDetails();
    }
}
