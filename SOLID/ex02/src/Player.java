public class Player {
    private final MediaDecoder decoder;
    private final MediaRenderer renderer;
    private final FrameCache cache;

    public Player(MediaDecoder decoder, MediaRenderer renderer, FrameCache cache) {
        this.decoder = decoder;
        this.renderer = renderer;
        this.cache = cache;
    }

    public void play(byte[] fileBytes) {
        Frame frame = decoder.decode(fileBytes);
        renderer.render(frame);
        cache.cacheFrame(frame);
        System.out.println("Cached last frame? " + (cache.getLastFrame() != null));
    }
}