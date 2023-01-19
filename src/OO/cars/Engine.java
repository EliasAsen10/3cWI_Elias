package OO.cars;

public class Engine {
    public enum TYPE{DIESEL, GAS}
    private int horsepower;
    private TYPE type;



    public Engine(int horsepower, TYPE type) {
        this.horsepower = horsepower;
        this.type = type;

    }



    public void drive (int amount) {

        System.out.println("The motor is running with" + amount);
    }

    public int getHorsepower() {
        return horsepower;
    }

    public void setHorsepower(int horsepower) {
        this.horsepower = horsepower;
    }

    public TYPE getType() {
        return type;
    }

    public void setType(TYPE type) {
        this.type = type;
    }
}
