package at.ran.objects;

public class Engine {
    public enum TYPE{DIESEL,GAS}
    private int horsepower;
    private String type;


    public Engine(int horsepower, String type) {
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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
