package videorender;

public class Main {

    public static void main(String[] args) {

        RenderEngine ffmpeg = new FFmpegRenderEngine();
        RenderEngine gpu = new GpuRenderEngine();

        System.out.println("=== Short Video with FFmpeg ===");

        VideoRenderer shortVideo = new ShortVideoRenderer(ffmpeg);
        shortVideo.render("short.mp4");

        System.out.println("\n=== Short Video with GPU ===");

        shortVideo = new ShortVideoRenderer(gpu);
        shortVideo.render("short.mp4");

        System.out.println("\n=== Long Video with FFmpeg ===");

        VideoRenderer longVideo = new LongVideoRenderer(ffmpeg);
        longVideo.render("podcast.mp4");

        System.out.println("\n=== Long Video with GPU ===");

        longVideo = new LongVideoRenderer(gpu);
        longVideo.render("podcast.mp4");
    }
}