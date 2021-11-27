import container.Factory;
import person.*;
import task.ITask;

public class Main {
    public static void main(String[] args) {
        IPerson employee1 = Factory.getPerson("Yashodha", "Hettitarachchi", "yd.info.com", "119");
        ITask task = Factory.getTask("Code Refactoring", employee1, 16);

        task.changeStatus(1);

        task.logWork(4);
        task.logWork(8);
        task.logWork(8);

        task.changeStatus(2);
    }
}
