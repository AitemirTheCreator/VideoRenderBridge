package videorender;

public class FFmpegRenderEngine implements RenderEngine {

    @Override
    public void initialize() {
        System.out.println("[FFmpeg] Render engine initialized.");
    }

    @Override
    public void render(String videoFile, String videoType) {
        System.out.println("[FFmpeg] Rendering " + videoType + " video: " + videoFile);
    }
}