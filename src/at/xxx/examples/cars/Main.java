package at.xxx.examples.cars;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Engine e1 = new Engine(100,"V8");
        Car c1 = new Car("Blau", 100,100,e1);
        Producer p1 = new Producer(2,"EliasGmbh","Austria");
        Producer p2 = new Producer(2,"AsenGmbh","Austria");

        c1.addProducer(p1);
        c1.addProducer(p2);
        System.out.println("Kilometer Anzahl angeben ->");
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();


        if (t > 5000) {
            System.out.println("Basis Verbruach entspricht bei über 50 000 tausend Kilometer " + (int) c1.getBasicUse() * 1.19);
        }
            else {
            System.out.println("Basis Verbruach entspricht bei unter 50 000 tausend Kilometer " + c1.getBasicUse());
        }



        System.out.println("Rabatt Preis beträgt " + (int) (c1.getBasePrice() - p1.getDiscount() ) + "€");

    }

}
