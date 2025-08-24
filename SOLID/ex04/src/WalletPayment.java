public class WalletPayment implements Payment {
    private final double amount;

    public WalletPayment(double amount) {
        this.amount = amount;
    }

    @Override
    public double getAmount() {
        return amount;
    }

    @Override
    public String process() {
        return "Wallet debit: " + amount;
    }
}
