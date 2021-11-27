package notification;

import person.IPerson;

public class EmailService implements INotificationService {
    public void sendMail(IPerson person, String body) {
        System.out.println(body + " sending to ... " + person.getEmail());
    }
}
