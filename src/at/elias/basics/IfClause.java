package at.elias.basics;


import java.util.Random;

public class IfClause {

    public static void main(String[] args) {
        System.out.println("hello");
        Random random = new Random();
        int randomNumber = random.nextInt(100);
        System.out.println(randomNumber);

        if (randomNumber < 20) {
            System.out.println("mini");
        } else if (randomNumber > 20 && randomNumber<50) {
            System.out.println("medium");
        } else if (randomNumber>50) {
            System.out.println("large");
            
        }
    }
}

