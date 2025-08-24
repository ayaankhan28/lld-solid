public class SimpleOrderRepository implements OrderRepository {
    @Override
    public void saveOrder(String customerEmail, double total) {
        System.out.println("Order stored in DB for customer " + customerEmail + " with total " + total);
    }
}
