public class SimpleMediaDecoder implements MediaDecoder {
    @Override
    public Frame decode(byte[] data) {
        return new Frame(data);
    }
}
