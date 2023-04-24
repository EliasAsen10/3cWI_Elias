package OO.Phone;

public class Main {
    Camera camera = new Camera();
    SDCard card = new SDCard(23445);
    Sim sim = new Sim(1921,"6694909")

    Phone phone = new Phone(card,sim,camera,"grün");
    PhoneGUI Pg = new PhoneGUI(phone);
    Pg.run();



}
