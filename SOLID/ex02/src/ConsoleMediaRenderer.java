public class ConsoleMediaRenderer implements MediaRenderer {
    @Override
    public void render(Frame frame) {
        System.out.println("\u25B6 Playing " + frame.data.length + " bytes");
    }
}
