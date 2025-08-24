public class Demo03 {
    public static void main(String[] args) {
        Shipment standard = new StandardShipment(2.0);
        Shipment express = new ExpressShipment(2.0);
        Shipment overnight = new OvernightShipment(2.0);

        System.out.println("Standard shipping cost: $" + standard.calculateCost());
        System.out.println("Express shipping cost: $" + express.calculateCost());
        System.out.println("Overnight shipping cost: $" + overnight.calculateCost());

        Shipment factoryCreated = ShipmentFactory.createShipment("EXPRESS", 2.0);
        System.out.println("\nFactory created EXPRESS shipping cost: $" + factoryCreated.calculateCost());
    }
}
