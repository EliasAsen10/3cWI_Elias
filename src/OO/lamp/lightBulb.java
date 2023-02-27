package OO.lamp;

public class lightBulb {
    private String name;
    private String color;
    private double powerConsumption;
    private boolean on;


    public lightBulb(String name, String color, double powerConsumption) {
        this.name = name;
        this.color = color;
        this.powerConsumption = powerConsumption;
        this.on = false;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getpowerConsumption() {
        return powerConsumption;
    }

    public void setPowerUsage(double powerConsumption) {
        this.powerConsumption = powerConsumption;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public void turnOn() {
        if (!on) {
            on = true;
            System.out.println("Element eingeschaltet.");
            powerConsumption=powerConsumption+5;
            System.out.println("Element hat jetzt eine Leistungsaufname von " + powerConsumption);
        } else {
            System.out.println("Element ist bereits eingeschaltet.");
        }
    }

    public void turnOff() {
        if (on) {
            on = false;
            System.out.println("Element ausgeschaltet.");
        } else {
            System.out.println("Element ist bereits ausgeschaltet.");
        }
    }

}









