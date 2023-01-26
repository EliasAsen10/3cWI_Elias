package at.xxx.examples.cars;

public class Main {
    public static void main(String[] args) {

        Engine e1 = new Engine(100,"V8");
        Car c1 = new Car("Blau", 100,100,e1);
        Producer p1 = new Producer(2.2,"EliasGmbh","Austria");
        Producer p2 = new Producer(2,"AsenGmbh","Austria");

        c1.addProducer(p1);
        c1.addProducer(p2);


        System.out.println("Rabatt Preis beträgt" + );

    }

}
