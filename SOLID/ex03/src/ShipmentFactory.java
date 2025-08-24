public class ShipmentFactory {
    public static Shipment createShipment(String type, double weightKg) {
        switch (type.toUpperCase()) {
            case "STANDARD":
                return new StandardShipment(weightKg);
            case "EXPRESS":
                return new ExpressShipment(weightKg);
            case "OVERNIGHT":
                return new OvernightShipment(weightKg);
            default:
                throw new IllegalArgumentException("Unknown shipment type: " + type);
        }
    }
}
