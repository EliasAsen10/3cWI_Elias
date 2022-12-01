import at.ran.objects.Car;

public class Main {
 public static void main(String[] args) {


  Car c1 = new Car();
  c1.setBrand("Audi");
  c1.setFuelConsumption("20");
  c1.setSerialNumber("A1234");
  c1.setFuelAmount(70);
  c1.setColor("green");

  System.out.println(c1.getBrand());
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
