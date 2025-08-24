public class Demo02 {
    public static void main(String[] args) {
        MediaDecoder decoder = new SimpleMediaDecoder();
        MediaRenderer renderer = new ConsoleMediaRenderer();
        FrameCache cache = new SimpleFrameCache();

        Player player = new Player(decoder, renderer, cache);

        player.play(new byte[]{1, 2, 3, 4});
    }
}
