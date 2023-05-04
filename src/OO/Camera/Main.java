package OO.Camera;

public class Main {
    public static void main(String[] args) {
        SDCard card = new SDCard();
        Camera cam = new Camera(card);

        cam.takepicture();
        cam.setResolution(Camera.TYPE.groß);
        cam.takepicture();
        cam.setResolution(Camera.TYPE.mittel);
        cam.takepicture();
    }
}
