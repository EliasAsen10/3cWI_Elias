package OO.Airplane;

public class Tank   {
    private int maxfuel;
    private int currenttankstauts;

    public Tank(int maxfuel, int currenttankstauts) {
        this.maxfuel = maxfuel;
        this.currenttankstauts = currenttankstauts;
    }

    public int getMaxfuel() {
        return maxfuel;
    }

    public void setMaxfuel(int maxfuel) {
        this.maxfuel = maxfuel;
    }

    public int getCurrenttankstauts() {
        return currenttankstauts;
    }

    public void setCurrenttankstauts(int currenttankstauts) {
        this.currenttankstauts = currenttankstauts;
    }

    public void tankstatus(){
        System.out.println(this.currenttankstauts);
    }
}
