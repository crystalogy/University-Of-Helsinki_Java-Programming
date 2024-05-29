
public class Main {

    public static void main(String[] args) {

        MessagingService service = new MessagingService();
        Message shortMessage = new Message("Alice", "Hello, this is a short message.");
        Message longMessage = new Message("Bob", "A".repeat(281)); // Message with 281 characters

        service.add(shortMessage);
        service.add(longMessage);

        System.out.println(service.getMessages().size());
    }
}
