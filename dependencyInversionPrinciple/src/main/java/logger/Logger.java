package logger;

public class Logger implements ILogger {
    @Override
    public void log(String message) {
        System.out.println(message);
    }
}
