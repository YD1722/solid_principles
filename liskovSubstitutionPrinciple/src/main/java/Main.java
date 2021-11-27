public class Main {
    public static void main(String[] args) {
        IManager countryManager = new Manager();

        countryManager.firstName = "Kudu";
        countryManager.lastName = "Nuwan";
        countryManager.salary = 8000;
        countryManager.getRatePerHour();


        IManager regionalManager = new Manager();

        regionalManager.firstName = "Wele";
        regionalManager.lastName = "Suda";
        regionalManager.salary = 12131;
        regionalManager.assignManager(countryManager);
        regionalManager.getRatePerHour();


        IEmployee ceo = new CEO();
        ceo.firstName = "YD";
        ceo.lastName = "Malli";
        ceo.salary = 7000;
        ceo.getRatePerHour();
    }
}
