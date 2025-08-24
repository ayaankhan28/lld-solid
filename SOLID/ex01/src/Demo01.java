

public class Demo01 {
    public static void main(String[] args) {
        NotificationService emailService = new EmailClient();
        TaxCalculator taxCalculator = new StandardTaxCalculator(0.18);
        OrderRepository orderRepository = new SimpleOrderRepository();

        OrderService orderService = new OrderService(emailService, taxCalculator, orderRepository);

        orderService.checkout("customer@shop.com", 100.0);
    }
}
