package OO.cars;

public class Wheel {
    public enum TYPE{AUDI, MERCEDES};
    private int size;

    private TYPE type;

    public Wheel(int size, TYPE type) {
        this.type = type;
        this.size = size;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public TYPE getType() {
        return type;
    }

    public void setType(TYPE type) {
        this.type = type;
    }
}


