package videoBook;

import java.util.Date;

public class DVD extends IBorrowableVideoBook {

    @Override
    public Date getDueDate() {
        return null;
    }

    @Override
    public void checkIn() {

    }

    @Override
    public void checkOut() {

    }
}
