public class Aviary {
    public void releaseFlyingBird(FlyingBird bird) {
        bird.move();
        bird.fly();
        System.out.println("Bird released into the air!");
    }

    public void releaseSwimmingBird(SwimmingBird bird) {
        bird.move();
        bird.swim();
        System.out.println("Bird released into the water!");
    }

    public void releaseBird(Bird bird) {
        bird.move();
        System.out.println("Bird released into its natural habitat!");
    }
}