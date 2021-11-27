package task;

import container.TestFactory;
import org.junit.BeforeClass;
import org.junit.Test;
import person.IPerson;

public class TaskTest {
    IPerson owner;

    @BeforeClass
    public void setUpOwner() {
        owner = TestFactory.getPerson("TestUser", "Test User", "test@email", "test123");
    }

    @Test
    public void shouldSendMailWhenTaskIsDone() {
        ITask task = TestFactory.getTask("Dummy Task", owner, 12);

        task.logWork(12);
        task.changeStatus(2);
    }
}
