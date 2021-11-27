public class Manager extends Employee {

    public void getRatePerHour() {
        System.out.println(this.firstName + " " + this.lastName + " : " + salary / (6 * 20));
    }

    public void generatePerformanceView() {
        System.out.println("Oops, Performance review !!");
    }
}
