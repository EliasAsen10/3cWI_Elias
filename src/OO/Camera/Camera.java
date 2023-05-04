package OO.Camera;

public class Camera {
    public enum TYPE {klein, mittel, groß}

    private SDCard sdCard;
    private int weight;
    private String color;

    private TYPE resolution;


    public Camera(SDCard sdCard) {
        this.sdCard = sdCard;
    }

    public Camera(int weight, String color) {

        this.weight = weight;
        this.color = color;
    }

    public TYPE getType() {
        return resolution;
    }

    public void setType(TYPE type) {
        this.resolution = type;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public File takepicture() {
        int size = 0;
        if (resolution == TYPE.groß) {
            size = 6;
        } else if (resolution==TYPE.mittel) {
            size = 4;
        } else if (resolution == TYPE.klein) {
            size = 2;

        }





        File file = new File("Pic01", size);
        System.out.println("File was made" + file.getName() + " size:" + file.getSizeInMb());
        return file;
    }

    public TYPE getResolution() {
        return resolution;
    }

    public void setResolution(TYPE resolution) {
        this.resolution = resolution;
    }
}
