package videorender;

public class LongVideoRenderer extends VideoRenderer {

    public LongVideoRenderer(RenderEngine engine) {
        super(engine);
    }

    @Override
    public void render(String videoFile) {
        System.out.println("Rendering long video: " + videoFile);
        engine.initialize();
        engine.render(videoFile, "long");
    }
}