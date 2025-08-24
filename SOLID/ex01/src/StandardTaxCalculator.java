public class StandardTaxCalculator implements TaxCalculator {
    private final double taxRate;

    public StandardTaxCalculator(double taxRate) {
        this.taxRate = taxRate;
    }

    @Override
    public double calculateTotalWithTax(double subtotal) {
        return subtotal + subtotal * taxRate;
    }
}
