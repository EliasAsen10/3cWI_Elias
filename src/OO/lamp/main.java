package OO.lamp;

import java.util.List;

public class main {
    public static void main(String[] args) {
        lamp l1= new lamp(100,2);
        lightBulb lb1 = new lightBulb("Bernd","blau", 98);
        lightBulb lb2 = new lightBulb("Karl","Rot",90);
        lightBulb lb3 = new lightBulb("Heinz","Gelb",80);
        l1.addlightBulb(lb1);
        l1.addlightBulb(lb2);
        l1.addlightBulb(lb3);
        l1.printNamesOfLightElements();
        l1.turnAllOn();
        l1.turnAllOn();
        List<lightBulb> bulbs = l1.getBulbs();

        for (lightBulb bulb:bulbs) {

        }


        l1.getOverallPowerUsage();




    }




}


