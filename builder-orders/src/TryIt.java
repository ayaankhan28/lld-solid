import com.example.orders.*;

public class TryIt {
    public static void main(String[] args) {
        OrderLine l1 = new OrderLine.Builder(
            "A",
            1,
            200
        )
            .build();
        
            OrderLine l2 = new OrderLine.Builder(
            "B",
            3,
            100
        )
            .quantity(999)
            .build();
        
        Order o = new Order.Builder("o2", "a@b.com")
            .discountPercent(10)
            .addLine(l1)
            .addLine(l2)
            .build();
            
        System.out.println("Before: " + o.totalBeforeDiscount());
        System.out.println("After:  " + o.totalAfterDiscount());
        System.out.println(
            "=> In the solution, totals remain stable due to defensive copies."
        );
    }
}
