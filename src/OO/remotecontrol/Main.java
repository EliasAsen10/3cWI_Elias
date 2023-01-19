package OO.remotecontrol;

public class Main {
    public static void main(String[] args) {

        Battery b1 = new Battery(10,Battery.TYPE.LIIO);
        Battery b2 = new Battery(120,Battery.TYPE.XYZ);
        RemoteControl rc1 = new RemoteControl(b1,b2);

        System.out.println(b1.getState());
        System.out.println(b2.getState());

        rc1.turnOn();

        System.out.println(b2.getState());

        rc1.turnOff();





    }
}
