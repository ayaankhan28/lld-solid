public class EmailClient implements NotificationService {
    @Override
    public void notify(String recipient, String message) {
        System.out.println("[EMAIL to=" + recipient + "] " + message);
    }
}