package OO.remotecontrol;

public class Battery {
    private int state;


    public enum TYPE {LIIO, XYZ};

    private TYPE conection;

    public Battery(int state,TYPE conection) {
        this.state = state;

        this.conection = conection;
    }


    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }
}
