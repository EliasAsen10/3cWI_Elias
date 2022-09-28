package at.elias.basics;

import java.util.Random;

public class WhileLoop1 {
    public static void main(String[] args) {
        Random random = new Random();
        boolean isfinished=false;
        while (!isfinished){
            int a=0;
            int randomNumber1 = random.nextInt(100);
            int randomNumber2 = random.nextInt(100);
            if (randomNumber1 == 15 || randomNumber2==15) {
                isfinished=true;
                a=randomNumber1+randomNumber2;
            } else if (randomNumber1==25 || randomNumber2==25) {
                isfinished=true;
                a=randomNumber1+randomNumber2;

            }
            System.out.println(a);
        }

    }
}
