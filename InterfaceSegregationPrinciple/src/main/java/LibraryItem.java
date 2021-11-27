import java.util.Date;

public abstract class LibraryItem {
    String id;
    String title;
    String author;
    Date borrowDate;
    Borrower borrower;
    int pages;

    abstract void checkIn();

    abstract void checkOut();

    abstract Date getDueDate();
}
