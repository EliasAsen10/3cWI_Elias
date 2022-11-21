import at.ran.objects.Car;

public class Main {
 public static void main(String[] args) {


  Car c1 = new Car();
  c1.brand = "Audi";
  c1.fuelConsumption= 8;
  c1.serialNumber= "A1234";


  Car c2 = new Car();
  c2.brand = "Mercedes";
  c2.fuelConsumption = 7;
  c2.serialNumber = "A1234n";
  System.out.println(c1.serialNumber);
  System.out.println(c2.serialNumber);


 }
}

