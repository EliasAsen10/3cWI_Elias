package OO.Phone;

import java.util.Date;
import java.util.List;

public class Phone {
    private SDCard card;

    private Sim sim;

    private Camera camera;
    private String color;

    public Phone(SDCard sdCard, Sim sim, Camera camera, String color) {
        this.card = sdCard;
        this.sim = sim;
        this.camera = camera;
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public SDCard getSdCard() {
        return card;
    }

    public void setSdCard(SDCard sdCard) {
        this.card = sdCard;
    }

    public Sim getSim() {
        return sim;
    }

    public void setSim(Sim sim) {
        this.sim = sim;
    }

    public Camera getCamera() {
        return camera;
    }

    public void setCamera(Camera camera) {
        this.camera = camera;
    }

    public void takePicture() {
        if (this.card == null || this.card.getFreeSpace() < 100) {
            System.out.println("Kein Platz oder keine Karte");
            return;
        }
        Phonefile file = this.camera.takePicture();
        file.setName("picture-" + (new Date()).getTime());
        file.setExtension("jpg");
        card.saveFile(file);

    }


    public void doCall(String number) {
        this.sim.doCall(number);
    }

    public List<Phonefile> getAllFiles() {
       return this.card.getFiles();
    }




    public int getFreeSpace(){
        return this.card.getFreeSpace();

    }
}
