package at.elias.basics;

public class ForLoop2 {
    public static void main(String[] args) {
        int a=0;
        for (int i = 2; i <=1000 ; i+=2) {
            a=a+i;
            System.out.println(i);
        }
        System.out.println(a);
    }
}
