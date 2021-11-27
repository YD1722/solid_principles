package task;

import common.Status;
import logger.ILogger;
import notification.INotificationService;
import person.IPerson;

public class Task implements ITask {
    private ILogger logger;
    private INotificationService messageService;

    private String taskName;
    private IPerson owner;
    private double estimatedHours;
    private double workedHours;
    private int status; // 0: open 1: inProgress 2:done

    public Task(String taskName,
                IPerson owner,
                double estimatedHours,
                ILogger logger,
                INotificationService messageService) {
        this.taskName = taskName;
        this.owner = owner;
        this.estimatedHours = estimatedHours;
        this.logger = logger;
        this.messageService = messageService;
    }

    @Override
    public void logWork(double hours) {
        this.workedHours += hours;
        logger.log(owner.getFirstName() + " logs " + hours + " hours to the task " + taskName);
    }

    @Override
    public void changeStatus(int status) {
        this.status = status;
        logger.log(owner.getFirstName() + " change the status of  " + taskName + " to " + status);

        if (this.status == Status.DONE.getValue()) {
            messageService.sendMessage(owner, taskName + " is completed");
        }
    }

}
