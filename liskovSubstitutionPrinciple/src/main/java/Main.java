public class Main {
    public static void main(String[] args) {
        Manager countryManager = new Manager();

        countryManager.firstName = "Kudu";
        countryManager.lastName = "Nuwan";
        countryManager.salary = 8000;
        countryManager.getRatePerHour();

//        Employee employee = new Employee();
        Employee employee = new CEO();

        employee.firstName = "YD";
        employee.lastName = "Malli";
        employee.salary = 7000;
        employee.assignManager(countryManager);

        employee.getRatePerHour();
    }
}
