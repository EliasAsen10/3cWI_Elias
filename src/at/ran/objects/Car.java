package at.ran.objects;

public class Car {
public int fuelConsumption;
public String brand;
public String serialNumber;
private String color;

public Car(int fuelConsumption, String brand, String serialNumber){
this.fuelConsumption = fuelConsumption;
this.serialNumber = serialNumber;
}

public int fuelAmount;

public void drive() {
    this.fuelAmount = this.fuelAmount - fuelConsumption;
    System.out.println("I am drive");
}}