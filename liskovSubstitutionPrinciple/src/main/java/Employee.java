public class Employee extends BaseEmployee{
    public void getRatePerHour() {
        System.out.println(this.firstName + " " + this.lastName + " : " + (salary / (8 * 20)));
    }
}
