package videorender;

public class GpuRenderEngine implements RenderEngine {

    @Override
    public void initialize() {
        System.out.println("[GPU] GPU render engine initialized.");
    }

    @Override
    public void render(String videoFile, String videoType) {
        System.out.println("[GPU] Rendering " + videoType + " video: " + videoFile);
    }
}