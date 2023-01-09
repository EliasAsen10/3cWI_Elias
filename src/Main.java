import at.ran.objects.Car;
import at.ran.objects.Engine;
import at.ran.objects.rearMirror;

public class Main {
 public static void main(String[] args) {


  Engine e1 = new Engine(140, Engine.TYPE.DIESEL);


  Car c1 = new Car(e1,"Audi", "A1234");

  rearMirror r1 = new rearMirror(0,1);
  rearMirror r2 = new rearMirror(-20,10);
  c1.addMirror(r1);
  c1.addMirror(r2);
  c1.setBrand("Audi");
  c1.setFuelConsumption("20");
  c1.setSerialNumber("A1234");
  c1.setFuelAmount(70);
  c1.setColor("green");

  System.out.println(c1.getBrand());
  System.out.println(c1.getMirrors());
/*
  Car c2 = new Car();
  c2.brand = "Mercedes";
  c2.fuelConsumption = 6;
  c2.serialNumber = "A1234n";
  c2.fuelAmount=20;


  Car c3  = new Car( 17,"opel", "1234" );



  System.out.println(c3.serialNumber);




  System.out.println(c1.serialNumber);
  System.out.println(c2.serialNumber);

  System.out.println(c2.fuelAmount);
  c2.drive();
  System.out.println(c2.fuelAmount);

*/
 }
}
