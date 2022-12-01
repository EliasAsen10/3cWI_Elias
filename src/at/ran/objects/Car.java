package at.ran.objects;

public class Car {

    private Engine engine;
    private String fuelConsumption;
    private String brand;
    private String serialNumber;
    private String color;
    private int fuelAmount;

    public Car(Engine engine,String brand, String serialNumber) {
        this.engine=engine;
        this.brand = brand;
        this.serialNumber = serialNumber;
    }

    public void honk(){
        System.out.println("Ich bin ein "+  this.brand + "und habe die Serialnumber" + this.serialNumber +  "und habe" + this.getEngine().getHorsepower());
    }

    public String getFuelConsumption() {
        return fuelConsumption;
    }

    public void setFuelConsumption(String fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getFuelAmount() {
        return fuelAmount;
    }

    public void setFuelAmount(int fuelAmount) {
        this.fuelAmount = fuelAmount;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }
}



    /*
public Car(int fuelConsumption, String brand, String serialNumber){
this.fuelConsumption = fuelConsumption;
this.serialNumber = serialNumber;
}
*/

/*
    public void drive() {
        this.fuelAmount = this.fuelAmount - fuelConsumption;
        System.out.println("I am drive");
    }

    public int getFuelConsumption() {
        return fuelConsumption;
    }

    public void setFuelConsumption(int fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }
}

*/