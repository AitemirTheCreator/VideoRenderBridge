package videorender;

public interface RenderEngine {
    void initialize();
    void render(String videoFile, String videoType);
}