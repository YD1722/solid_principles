public class EmailService {
    public void sendMail(Person person, String body) {
        System.out.println(body + " is sent to " + person.email);
    }
}
