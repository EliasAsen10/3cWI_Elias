package OO.lamp;

import java.util.ArrayList;
import java.util.List;

public class lamp {
    private int size;
    private int lightIntensity;
    private List<lightBulb> bulbs;

    private boolean on;

    public lamp(int size, int lightIntensity) {
        this.size = size;
        this.lightIntensity = lightIntensity;
        bulbs = new ArrayList<>();
        on = false;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getLightIntensity() {
        return lightIntensity;
    }

    public void setLightIntensity(int lightIntensity) {
        this.lightIntensity = lightIntensity;
    }

    public List<lightBulb> getBulbs() {
        return bulbs;
    }

    public void setBulbs(List<lightBulb> bulbs) {
        this.bulbs = bulbs;
    }
    public void addlightBulb(lightBulb bulb){
        bulbs.add(bulb);
    }

    public void turnAllOn() {
        for (lightBulb bulb: this.bulbs) {
            bulb.turnOn();
        }
    }

    public double getOverallPowerUsage() {
            double totalPowerConsumption = 0.0;
            for (lightBulb bulb : this.bulbs) {
                totalPowerConsumption += bulb.getpowerConsumption();
            }
        System.out.println("die gesamte Gesamtleistung beträgt " + totalPowerConsumption);
            return totalPowerConsumption;
        }

    public void printNamesOfLightElements() {
        for (lightBulb bulb : this.bulbs) {
            System.out.println(bulb.getName());
        }
    }
        }



