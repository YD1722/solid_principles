package notification;

import person.IPerson;

public class SMSService implements INotificationService {
    @Override
    public void sendMessage(IPerson person, String body) {
        System.out.println(body + " sending to ... " + person.getPhone());
    }
}
