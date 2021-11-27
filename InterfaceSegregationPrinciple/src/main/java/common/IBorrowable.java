package common;

import java.util.Date;

public interface IBorrowable {
    Date getDueDate();

    void checkIn();

    void checkOut();
}
