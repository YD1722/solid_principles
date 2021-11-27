package common;

public enum Status {
    OPEN(0),
    IN_PROGRESS(1),
    DONE(2);

    private int value;

    Status(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
