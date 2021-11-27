public class Main {
    public static void main(String[] args) {
        Person employee1 = new Person("Yashodha", "Hettitarachchi", "yd.info.com", "119");

        Task task = new Task("Code Refactoring", employee1, 16);

        task.changeStatus(1);
        task.logWork(4);
        task.logWork(8);
        task.logWork(8);
        task.changeStatus(2);
    }
}
