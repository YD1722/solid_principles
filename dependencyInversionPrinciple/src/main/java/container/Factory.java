package container;

import logger.ILogger;
import logger.Logger;
import notification.EmailService;
import notification.INotificationService;
import person.IPerson;
import person.Person;
import task.ITask;
import task.Task;

public class Factory {
    private static ILogger logger;
    private static INotificationService emailService;

    public static IPerson getPerson(String firstName, String lastName, String email, String phone) {
        return new Person(firstName, lastName, email, phone);
    }

    public static ITask getTask(String taskName, IPerson owner, double estimatedHours) {
        return new Task(taskName, owner, estimatedHours, getLogger(), getEmailService());
    }

    public synchronized static ILogger getLogger() {
        if (logger == null) {
            logger = new Logger();
        }

        return logger;
    }

    public synchronized static INotificationService getEmailService() {
        if (emailService == null) {
            emailService = new EmailService();
        }

        return emailService;
    }
}
