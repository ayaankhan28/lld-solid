
public class Demo05 {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(3, 4);
        Square square = new Square(5);

        System.out.println("Initial areas:");
        System.out.println("Rectangle (3x4): " + rectangle.area());
        System.out.println("Square (5x5): " + square.area());

        rectangle.setWidth(5);
        rectangle.setHeight(4);
        square.setSide(6);

        System.out.println("\nAreas after modification:");
        System.out.println("Rectangle (5x4): " + rectangle.area());
        System.out.println("Square (6x6): " + square.area());

        Shape[] shapes = {
            new Rectangle(2, 3),
            new Square(4)
        };

        System.out.println("\nPolymorphic area calculation:");
        for (Shape shape : shapes) {
            System.out.println(shape.getClass().getSimpleName() + " area: " + shape.area());
        }
    }
}
