public class CardPayment implements Payment {
    private final double amount;

    public CardPayment(double amount) {
        this.amount = amount;
    }

    @Override
    public double getAmount() {
        return amount;
    }

    @Override
    public String process() {
        return "Charged card: " + amount;
    }
}
