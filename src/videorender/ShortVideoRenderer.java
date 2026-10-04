package videorender;

public class ShortVideoRenderer extends VideoRenderer {

    public ShortVideoRenderer(RenderEngine engine) {
        super(engine);
    }

    @Override
    public void render(String videoFile) {
        System.out.println("Rendering short video: " + videoFile);
        engine.initialize();
        engine.render(videoFile, "short");
    }
}