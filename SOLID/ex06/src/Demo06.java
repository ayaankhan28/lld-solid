public class Demo06 {
    public static void main(String[] args) {
        Aviary aviary = new Aviary();
        
        FlyingBird sparrow = new Sparrow();
        SwimmingBird penguin = new Penguin();

        System.out.println("Releasing Sparrow:");
        aviary.releaseFlyingBird(sparrow);

        System.out.println("\nReleasing Penguin:");
        aviary.releaseSwimmingBird(penguin);

        System.out.println("\nReleasing birds using base type:");
        Bird[] birds = {sparrow, penguin};
        for (Bird bird : birds) {
            aviary.releaseBird(bird);
        }
    }
}
