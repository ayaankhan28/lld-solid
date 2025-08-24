public class PaymentFactory {
    public static Payment createPayment(String provider, double amount) {
        switch (provider.toUpperCase()) {
            case "CARD":
                return new CardPayment(amount);
            case "UPI":
                return new UpiPayment(amount);
            case "WALLET":
                return new WalletPayment(amount);
            default:
                throw new IllegalArgumentException("Unknown payment provider: " + provider);
        }
    }
}
