class StudentAttendance {
    private String[] presentStudents;
    private int count;

    public StudentAttendance(int maxStudents) {
        presentStudents = new String[maxStudents];
        count = 0;
    }

    public void markPresent(String studentName) {
        if (count < presentStudents.length) {
            presentStudents[count++] = studentName;
        }
    }

    public int getPresentCount() {
        return count;
    }

    public boolean isPresent(String studentName) {
        for (int i = 0; i < count; i++) {
            if (presentStudents[i].equalsIgnoreCase(studentName)) {
                return true;
            }
        }
        return false;
    }
}

public class AttendanceSheet {
    public static void main(String[] args) {
        StudentAttendance sheet = new StudentAttendance(30);
        sheet.markPresent("Alice");
        sheet.markPresent("Bob");
        System.out.println("Present count: " + sheet.getPresentCount());
        System.out.println("Is Alice present? " + sheet.isPresent("Alice"));
    }
}
