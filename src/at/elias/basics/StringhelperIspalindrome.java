package at.elias.basics;

public class StringhelperIspalindrome {
    public static void main(String[] args) {
        String orginal = "mom";
        orginal.replace("","");
        String reverse = "";
        for(int i = orginal.length() -1; i>=0; i--){
            reverse += orginal.charAt(i);
            System.out.println(reverse);
        }

        boolean palindrome = true;
        for (int i =0; i<orginal.length();i++){
            if (orginal.charAt(i) != reverse.charAt(i)){
                palindrome = false;
            }
        }
        if(palindrome){
            System.out.println("Palindrome");
        } else {
            System.out.println("No Palindrome");
        }
    }
}