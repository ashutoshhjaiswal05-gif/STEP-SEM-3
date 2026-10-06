public class PasswordChecker {
    private final String password;

    public PasswordChecker(String password) {
        this.password = password != null ? password : "";
    }

    public String getStrength() {
        if (password.length() < 6) return "Weak";
        if (password.length() <= 9) return "Medium";
        return "Strong";
    }

    public static void main(String[] args) {
        PasswordChecker pc1 = new PasswordChecker("123");
        PasswordChecker pc2 = new PasswordChecker("myPass12345");
        System.out.println("pc1 Strength: " + pc1.getStrength());
        System.out.println("pc2 Strength: " + pc2.getStrength());
    }
}
