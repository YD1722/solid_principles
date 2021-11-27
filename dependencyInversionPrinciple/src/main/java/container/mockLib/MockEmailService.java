package container.mockLib;

import notification.INotificationService;
import person.IPerson;

public class MockEmailService implements INotificationService {
    @Override
    public void sendMessage(IPerson person, String body) {

    }
}
