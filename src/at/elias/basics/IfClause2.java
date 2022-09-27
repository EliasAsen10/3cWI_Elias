package at.elias.basics;

import java.util.Random;

public class IfClause2 {
    public static void main(String[] args) {
        Random random = new Random();
        int randomNumber = random.nextInt(100);
        System.out.println(randomNumber);
        int randomNumber2 = random.nextInt(100);
        System.out.println(randomNumber2);

        if (randomNumber < randomNumber2 && randomNumber < 50) {
            System.out.println("Zahl 2 ist kleiner als Zahl 2 Mini");
        } else if (randomNumber<30|randomNumber2<30) {
            System.out.println("Einer der beiden ist kleiner als 30");
            
        } else if (randomNumber<50&&randomNumber2!=50) {
            System.out.println("Erste Zahl klein, zweite kein 50iger");
            
        }
        {
            
        }
    }
}
