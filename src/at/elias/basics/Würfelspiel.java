package at.elias.basics;

import java.util.Random;
import java.util.Scanner;

public class Würfelspiel {
    public static void main(String[] args) {
        System.out.println("start the game 1.");
        System.out.println("restart the game 1.");
        System.out.println("break up 2.");
        Scanner scanner = new Scanner(System.in);
        int selection = scanner.nextInt();
        if (selection == 1) {
            System.out.println("start");
            int lose = 0;
            int win = 0;
            int draw = 0;
            Random random = new Random();
            for (int i = 1; i <= 6; i++) {
                int randomValuePC = random.nextInt(1, 6);
                System.out.println("opponent: " + i + ". " + "throw= " + randomValuePC);
                int randomValuePlayer = random.nextInt(1, 6);
                System.out.println("  player: " + i + ". " + "throw= " + randomValuePlayer);
                if (randomValuePC > randomValuePlayer) {
                    lose = lose + 1;
                } else if (randomValuePlayer > randomValuePC) {
                    win = win + 1;
                } else {
                    draw = +1;

                }
            }
            System.out.println("loses: " + lose);
            System.out.println("wins: " + win);

            if (lose > win) {
                System.out.println("you lost!");
            } else if (win > lose) {
                System.out.println("you won!");

            } else if (win == lose) {
                System.out.println("Its a draw");
            }

        } else if (selection==2) {
            System.out.println("end");

        }

    }
}






