public class Manager extends IManager {
    public void getRatePerHour() {
        System.out.println(this.firstName + " " + this.lastName + " : " + salary / (6 * 20));
    }

    @Override
    public void generatePerformanceReview() {
        System.out.println("Manager is preparing performance review");
    }
}
