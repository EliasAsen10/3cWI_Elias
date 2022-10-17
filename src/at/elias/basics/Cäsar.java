package at.elias.basics;

public class Cäsar {
    public static void main(String[] args) {

        String result = encrypt(2, "afz");
        System.out.println(result);
    }

    public static String encrypt(int shift, String stringToEncrypt) {
        String encryptedString = "";
        char[] inputData = stringToEncrypt.toCharArray();
        for (int i = 0; i < inputData.length; i++) {

            int letter = inputData[i] + shift;

            if (letter > 122) {
                letter = 96 + (letter - 122);

            }
            System.out.println("newLetter:" + letter);
            encryptedString += Character.toString(letter);


        }


        return encryptedString;

    }
}


