package at.elias.basics;

public class countletters {

    public static void main(String[] args) {int result = countletters("Hans achtet auf mich", 'a');
        System.out.println("Der gesuchte Buchstabe ist " + result + "enthalten");
    }


    public static int countletters(String text, char search) {

        char[] textArray = text.toCharArray();
        int count = 0;
        for (int i = 0; i < textArray.length; i++) {
            if (textArray[i] == search) {
                count++;
            }
        }

        return count;
    }
}


