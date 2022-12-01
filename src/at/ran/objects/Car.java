package at.ran.objects;

public class Car {
    private String fuelConsumption;
    private String brand;
    private String serialNumber;
    private String color;
    private int fuelAmount;



    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setFuelAmount(int fuelAmount) {
        this.fuelAmount = fuelAmount;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public void setFuelConsumption(String fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }

    public String getFuelConsumption() {
        return fuelConsumption;
    }

    public String getColor() {
        return color;
    }

    public String getBrand() {
        return brand;
    }

    public int getFuelAmount() {
        return fuelAmount;
    }

    public String getSerialNumber() {
        return serialNumber;
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