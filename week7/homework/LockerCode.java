class Locker {
    private final String lockerId;
    private String code;

    public Locker(String lockerId, String initialCode) {
        this.lockerId = lockerId;
        this.code = initialCode;
    }

    public boolean changeCode(String currentCode, String newCode) {
        if (this.code.equals(currentCode)) {
            this.code = newCode;
            return true;
        }
        return false;
    }

    public boolean unlock(String enterCode) {
        return this.code.equals(enterCode);
    }

    public String getLockerId() {
        return lockerId;
    }
}

public class LockerCode {
    public static void main(String[] args) {
        Locker locker = new Locker("L-101", "1234");
        boolean changed = locker.changeCode("1234", "5678");
        System.out.println("Code changed: " + changed);
        System.out.println("Unlock with 5678: " + locker.unlock("5678"));
    }
}
