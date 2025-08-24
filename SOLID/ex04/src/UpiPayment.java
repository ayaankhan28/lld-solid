public class UpiPayment implements Payment {
    private final double amount;

    public UpiPayment(double amount) {
        this.amount = amount;
    }

    @Override
    public double getAmount() {
        return amount;
    }

    @Override
    public String process() {
        return "Paid via UPI: " + amount;
    }
}
