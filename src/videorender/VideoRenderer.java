package videorender;

public abstract class VideoRenderer {

    protected final RenderEngine engine;

    protected VideoRenderer(RenderEngine engine) {
        this.engine = engine;
    }

    public abstract void render(String videoFile);
}