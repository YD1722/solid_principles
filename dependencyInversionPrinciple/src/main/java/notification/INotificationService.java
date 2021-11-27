package notification;

import person.IPerson;

public interface INotificationService {
    void sendMessage(IPerson person, String body);
}
