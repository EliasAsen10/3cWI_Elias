package OO.remotecontrol;

public class RemoteControl {

    private Battery battery1;

    private Battery battery2;

    public RemoteControl(Battery battery1, Battery battery2) {
        this.battery1 = battery1;
        this.battery2 = battery2;
    }

    public RemoteControl() {

    }

    public Battery getBattery1() {
        return battery1;
    }

    public void setBattery1(Battery battery1) {
        this.battery1 = battery1;
    }

    public Battery getBattery2() {
        return battery2;
    }

    public void setBattery2(Battery battery2) {
        this.battery2 = battery2;
    }

    public void turnOn(){
       this.battery2.setState(this.battery2.getState()-5);
    }

    public void turnOff(){
        System.out.println("Kein Verbraucher angeschlossen");
    }
}


