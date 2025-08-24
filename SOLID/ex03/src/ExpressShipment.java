public class ExpressShipment implements Shipment {
    private final double weightKg;

    public ExpressShipment(double weightKg) {
        this.weightKg = weightKg;
    }

    @Override
    public double getWeightKg() {
        return weightKg;
    }

    @Override
    public double calculateCost() {
        return 80 + 8 * weightKg;
    }
}
