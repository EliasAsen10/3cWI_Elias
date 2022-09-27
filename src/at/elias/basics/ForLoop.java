package at.elias.basics;

public class ForLoop {
    public static void main(String[] args) {
        int a = 0;
        for (int i = 0; i <= 100; i++) {
            System.out.println(i);
            a= i + a;



        }
        System.out.println("Alle Zahlen zusammen addiert=" + a);
    }
}