abstract class LibraryItem {
    String title;
    int issueDays;
    public LibraryItem(String title, int issueDays) {
        this.title = title;
        this.issueDays = issueDays;
    }
    public abstract int getReturnDays();
}

class BookItem extends LibraryItem {
    public BookItem(String title) { super(title, 14); }
    @Override public int getReturnDays() { return 14; }
}

class MagazineItem extends LibraryItem {
    public MagazineItem(String title) { super(title, 7); }
    @Override public int getReturnDays() { return 7; }
}

public class LibraryItemDueDateCalculator {
    public static void main(String[] args) {
        LibraryItem item1 = new BookItem("1984");
        LibraryItem item2 = new MagazineItem("Time");
        System.out.printf("%s: Due in %d days\n", item1.title, item1.getReturnDays());
        System.out.printf("%s: Due in %d days\n", item2.title, item2.getReturnDays());
    }
}
