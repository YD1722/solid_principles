public class CEO extends Employee {
    @Override
    public void assignManager(Employee manager) {
        throw new RuntimeException("WTF ? Assign some one to CEO ?");
    }

    @Override
    public void getRatePerHour() {
        System.out.println(this.firstName + " " + this.lastName + " : " + salary / (4 * 20));
    }

    public void generatePerformanceReview() {
        System.out.println("I am writing performance review .. mmm les see");
    }

    public void fire() {
        System.out.println("I am gonna fire someone");
    }
}
