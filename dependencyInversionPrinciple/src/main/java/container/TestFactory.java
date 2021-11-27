package container;


import logger.ILogger;
import container.mockLib.MockEmailService;
import container.mockLib.MockLogger;
import container.mockLib.MockSMSService;
import notification.INotificationService;
import person.IPerson;
import task.ITask;
import task.Task;

public class TestFactory extends Factory {
    private static ILogger mokLogger;

    private static INotificationService emailService;
    private static INotificationService smsService;

    public static ITask getTask(String taskName, IPerson owner, double estimatedHours) {
        return new Task(taskName, owner, estimatedHours, getLogger(), getSmsService());
    }

    public synchronized static ILogger getLogger() {
        if (mokLogger == null) {
            mokLogger = new MockLogger();
        }

        return mokLogger;
    }

    public synchronized static INotificationService getEmailService() {
        if (emailService == null) {
            emailService = new MockEmailService();
        }

        return emailService;
    }

    public synchronized static INotificationService getSmsService() {
        if (smsService == null) {
            smsService = new MockSMSService();
        }

        return smsService;
    }
}
