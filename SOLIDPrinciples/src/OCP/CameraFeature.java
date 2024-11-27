package OCP;
public class CameraFeature implements Feature {
    @Override
    public void applyFeature(OperatingSystem os) {
        System.out.println("Opening Camera...");
        takePicture();
        recordVideo(); 
    }

    private void takePicture() {
        System.out.println("Picture taken and saved to gallery.");
    }

    private void recordVideo() {
        System.out.println("Video recording started...");
        System.out.println("Video recorded and saved to gallery.");
    }
}
