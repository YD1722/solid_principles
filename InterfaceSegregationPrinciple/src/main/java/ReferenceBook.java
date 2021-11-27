import java.util.Date;

public class ReferenceBook extends LibraryItem {
    @Override
    void checkIn() {
        throw new RuntimeException("Method not implemented");
    }

    @Override
    void checkOut() {
        throw new RuntimeException("Method not implemented");
    }

    @Override
    Date getDueDate() {
        return null;
    }
}
