
public class Demo04 {
    public static void main(String[] args) {
        PaymentService paymentService = new PaymentService();
        Payment cardPayment = new CardPayment(499);
        Payment upiPayment = new UpiPayment(599);
        Payment walletPayment = new WalletPayment(299);

        System.out.println(paymentService.processPayment(cardPayment));
        System.out.println(paymentService.processPayment(upiPayment));
        System.out.println(paymentService.processPayment(walletPayment));

        Payment factoryPayment = PaymentFactory.createPayment("UPI", 499);
        System.out.println("\nFactory created payment: " + paymentService.processPayment(factoryPayment));
    }
}
