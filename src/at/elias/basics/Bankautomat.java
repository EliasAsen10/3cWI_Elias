package at.elias.basics;

import java.util.Scanner;

public class Bankautomat {
    public static void main(String[] args) {
        boolean isFinished = false;
        int balance = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("1. Einzahlen");
        System.out.println("2. Abheben");
        System.out.println("3. Kontostand");
        System.out.println("4. Beenden");

        while (isFinished==false) {
            int selection = scanner.nextInt();
            System.out.println(selection);
            if (selection == 1) {
                System.out.println("Geben Sie den Betrag ein den sie einzahlen möchten");
                int deposit = scanner.nextInt();
                System.out.println("Sie haben " + deposit + " eingezahlt");
                balance = balance + deposit;

            }
            if (selection == 2) {
                System.out.println("Geben Sie den Betrag ein den sie abheben möchten");
                int withdraw = scanner.nextInt();
                balance = balance - withdraw;
                System.out.println("Sie haben " + withdraw + " abgehoben");

            }

            if (selection == 3) {
                System.out.println("Ihr Kontostand beträgt " + balance);

            }
            if (selection == 4) {
                isFinished = true;
                System.out.println("Machine ist stopping");
            }
        }
    }
}
