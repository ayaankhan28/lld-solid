public class Sparrow implements FlyingBird {
    @Override
    public void move() {
        System.out.println("Sparrow hops around");
    }

    @Override
    public void fly() {
        System.out.println("Sparrow flaps its wings and flies!");
    }
}
