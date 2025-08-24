public class SimpleFrameCache implements FrameCache {
    private Frame lastFrame;

    @Override
    public void cacheFrame(Frame frame) {
        this.lastFrame = frame;
    }

    @Override
    public Frame getLastFrame() {
        return lastFrame;
    }
}
