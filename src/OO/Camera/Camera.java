package OO.Camera;

public class Camera {
    private enum TYPE{klein, mittel, groß};
    private int weight;
    private String color;

    private TYPE type;

    public Camera(TYPE type) {
        this.type = type;
    }

    public Camera(int weight, String color) {

        this.weight = weight;
        this.color = color;
    }

    public TYPE getType() {
        return type;
    }

    public void setType(TYPE type) {
        this.type = type;
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
}
