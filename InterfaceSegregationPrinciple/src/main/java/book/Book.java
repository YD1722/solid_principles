package book;

import common.IBorrowable;

import java.util.Date;

public class Book extends IBook implements IBorrowable {
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
