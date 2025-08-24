public class Penguin implements SwimmingBird {
    @Override
    public void move() {
        System.out.println("Penguin waddles around");
    }

    @Override
    public void swim() {
        System.out.println("Penguin swims gracefully!");
    }
}