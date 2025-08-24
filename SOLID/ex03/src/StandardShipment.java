public class StandardShipment implements Shipment {
    private final double weightKg;

    public StandardShipment(double weightKg) {
        this.weightKg = weightKg;
    }

    @Override
    public double getWeightKg() {
        return weightKg;
    }

    @Override
    public double calculateCost() {
        return 50 + 5 * weightKg;
    }
}
