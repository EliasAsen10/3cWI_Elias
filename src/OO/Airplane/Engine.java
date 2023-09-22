package OO.Airplane;

public class Engine {
    public enum TYPE{DIESEL, GAS};
    private int hoursepower;

    private TYPE type;

    public Engine(int hoursepower, TYPE type) {
        this.hoursepower = hoursepower;
        this.type = type;
    }

    public int getHoursepower() {
        return hoursepower;
    }

    public void setHoursepower(int hoursepower) {
        this.hoursepower = hoursepower;
    }

    public TYPE getType() {
        return type;
    }

    public void setType(TYPE type) {
        this.type = type;
    }

    private void start(){
        System.out.println("Engine is on");
    }

    private void stop(){
        System.out.println("Engine is off");
    }
}
