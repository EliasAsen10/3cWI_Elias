package at.elias.basics;
import java.util.Scanner;

public class chemie {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String alkane = scanner.next();
        System.out.print("Geben Sie die Anzahl an l in Benzin an: ");
        double input = scanner.nextInt();

        double molAnzahl = 44;
        double molAlkane = 0;
        double m = 0;
        if (alkane.equals("Methan"))
        { molAlkane = 16.04; m = 1; }
        else if (alkane.equals("Ethan"))
        { molAlkane = 30.07; m = 2; }
        else if (alkane.equals("Propan"))
        { molAlkane = 44.1; m = 3; }
        else if (alkane.equals("Butan"))
        { molAlkane = 58.12; m = 4; }
        else if (alkane.equals("Pentan"))
        { molAlkane = 72.15; m = 5; }
        else if (alkane.equals("Hexan"))
        { molAlkane = 86.18; m = 6; }
        else if (alkane.equals("Heptan"))
        { molAlkane = 100.21; m = 7; }
        else if (alkane.equals("Oktan"))
        { molAlkane = 114.28; m = 8; }
        else if (alkane.equals("Nonan"))
        { molAlkane = 128.2; m = 9; }
        else if (alkane.equals("Decan"))
        { molAlkane = 142.29; m = 10; }
        System.out.println("So viel CO2 wird freigesetzt: " + (input / molAlkane * m * molAnzahl));
    }
    }










