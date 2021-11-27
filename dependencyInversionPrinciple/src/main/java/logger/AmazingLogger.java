package logger;

import java.util.Date;

public class AmazingLogger implements ILogger {
    @Override
    public void log(String message) {
        System.out.println(new Date().toString() + " : " + message);
    }
}
