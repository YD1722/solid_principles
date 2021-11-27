package container;

import logger.AmazingLogger;
import logger.ILogger;
import logger.Logger;
import notification.EmailService;
import notification.INotificationService;
import notification.SMSService;
import person.IPerson;
import person.Person;
import task.ITask;
import task.Task;

public class Factory {
    private static ILogger logger;

    private static INotificationService emailService;
    private static INotificationService smsService;

    public static IPerson getPerson(String firstName, String lastName, String email, String phone) {
        return new Person(firstName, lastName, email, phone);
    }

    /**
     * Dependency injection by dependency inversion principle
     *
     * @param taskName
     * @param owner
     * @param estimatedHours
     * @return
     */
    public static ITask getTask(String taskName, IPerson owner, double estimatedHours) {
        return new Task(taskName, owner, estimatedHours, getLogger(), getSmsService());
    }

    public synchronized static ILogger getLogger() {
        if (logger == null) {
            logger = new AmazingLogger();
        }

        return logger;
    }

    public synchronized static INotificationService getEmailService() {
        if (emailService == null) {
            emailService = new EmailService();
        }

        return emailService;
    }

    public synchronized static INotificationService getSmsService() {
        if (smsService == null) {
            smsService = new SMSService();
        }

        return smsService;
    }
}
