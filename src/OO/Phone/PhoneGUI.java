package OO.Phone;

import java.util.List;
import java.util.Scanner;

public class PhoneGUI {

    private Phone phone;

    public PhoneGUI(Phone phone) {
        this.phone = phone;
    }

    public void run() {
        System.out.println("Wilkommen in der Welt von Iphone");
        Scanner scan = new Scanner(System.in);

        while (true) {
            System.out.println("1 call " + "2 picture" + "3 ...");
            int choice = scan.nextInt();
            switch (choice) {
                case 1:
                    phone.doCall("66024304");
                    break;
                case 2:
                    phone.takePicture();
                    break;
                case 3:
                    System.out.println("noch frei" + phone.getFreeSpace());
                    break;
                case 4:
                    List<Phonefile> phonefiles = phone.getAllFiles();
                    for (Phonefile phonefile : phonefiles) {
                        System.out.println(phonefile.getInfo());
                    }
                    break;

            }
        }
    }
}



