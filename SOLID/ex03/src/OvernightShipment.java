public class OvernightShipment implements Shipment {
    private final double weightKg;

    public OvernightShipment(double weightKg) {
        this.weightKg = weightKg;
    }

    @Override
    public double getWeightKg() {
        return weightKg;
    }

    @Override
    public double calculateCost() {
        return 120 + 10 * weightKg;
    }
}
