class LibraryCard {
    String studentName;
    String cardId;

    public LibraryCard(String studentName, String cardId) {
        this.studentName = studentName;
        this.cardId = cardId;
    }

    public void displayCard() {
        System.out.printf("Library Card ID: %s | Student: %s\n", cardId, studentName);
    }
}

public class LibraryIDCardManagement {
    public static void main(String[] args) {
        LibraryCard card = new LibraryCard("Priya Patel", "LIB9982");
        card.displayCard();
    }
}
