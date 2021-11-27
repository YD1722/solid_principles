
public class Task {
    String taskName;
    Person owner;
    double estimatedHours;
    double workedHours;
    int status; // 0: open 1: inProgress 2:done

    public Task(String taskName, Person owner, double estimatedHours) {
        this.taskName = taskName;
        this.owner = owner;
        this.estimatedHours = estimatedHours;
    }

    public void logWork(double hours) {
        Logger logger = new Logger();

        workedHours += hours;
        logger.log(owner.firstName + " logs " + hours + " hours to the task " + taskName);
    }

    public void changeStatus(int status) {
        Logger logger = new Logger();

        this.status = status;
        logger.log(owner.firstName + " change the status of  " + taskName + " to " + status);

        if (this.status == 2) {
            EmailService emailService = new EmailService();
            emailService.sendMail(owner, taskName + " is completed");
        }
    }

}
