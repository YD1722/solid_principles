package notification;

import person.IPerson;

public interface INotificationService {
    void sendMail(IPerson person, String body);
}
