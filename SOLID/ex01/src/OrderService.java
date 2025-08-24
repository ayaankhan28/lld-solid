public class OrderService {
    private final NotificationService notificationService;
    private final TaxCalculator taxCalculator;
    private final OrderRepository orderRepository;

    public OrderService(NotificationService notificationService, 
                       TaxCalculator taxCalculator,
                       OrderRepository orderRepository) {
        this.notificationService = notificationService;
        this.taxCalculator = taxCalculator;
        this.orderRepository = orderRepository;
    }

    public void checkout(String customerEmail, double subtotal) {
        double total = taxCalculator.calculateTotalWithTax(subtotal);
        orderRepository.saveOrder(customerEmail, total);
        notificationService.notify(customerEmail, "Thanks! Your total is " + total);
    }
}