public class Employee {
    String firstName;
    String lastName;
    Integer salary;
    Employee manager;

    public void assignManager(Employee manager) {
        this.manager = manager;
    }

    public void getRatePerHour() {
        System.out.println(this.firstName + " " + this.lastName + " : " + (salary / (8 * 20)));
    }
}
