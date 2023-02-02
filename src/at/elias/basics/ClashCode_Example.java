package at.elias.basics;
import java.util.Scanner;
public class ClashCode_Example {
    public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            String t = in.nextLine();
            String High = "";
            String low = "";

            for(int i = 0; i < t.length(); i++)
            {
                if(Character.isUpperCase(t.charAt(i)))
                {
                    High = High + (t.charAt(i));
                }
                else
                {
                    low = low + (t.charAt(i));
                }
            }

            System.out.println(High);
            System.out.println(low);
        }
    }
