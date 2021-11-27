import java.util.Date;

public class DVD extends LibraryItem {
    String director;

    DVD() {
        this.author = "";
        this.pages = 0;
    }

    @Override
    void checkIn() {

    }

    @Override
    void checkOut() {

    }

    @Override
    Date getDueDate() {
        return null;
    }
}
