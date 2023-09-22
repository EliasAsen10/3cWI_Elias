package OO.Airplane;

import java.util.ArrayList;
import java.util.List;

public class Hanger {

    private int weidht;
    private int lenght;

    private List<Airplane>airplanes;

    private int anzahlflieger = 3;

    public Hanger(int weidht, int lenght) {
        this.weidht = weidht;
        this.lenght = lenght;
        this.airplanes =  new ArrayList<>();
    }

    public List<Airplane> getAirplanes() {
        return airplanes;
    }

    public int countAirplanes(){
        return airplanes.size();
    }

    public void infoAirplanes() {
        for (Airplane a : airplanes){
            System.out.println("Flugzeugfarbe:"+a.getColour()+ " PS Motor:"+a.getEngine().getHoursepower());
        }
    }

    public void setAirplanes(Airplane airplane) {
        if (this.airplanes.size() > anzahlflieger) {
            System.out.println("Kein Platz auf dem Flughafen");
        } else {
            this.airplanes.add(airplane);

        }
    }

    public int getWeidht() {
        return weidht;
    }

    public void setWeidht(int weidht) {
        this.weidht = weidht;
    }

    public int getLenght() {
        return lenght;
    }

    public void setLenght(int lenght) {
        this.lenght = lenght;
    }
    private void open(){
        System.out.println("Airport is opening");
    }

    private void clos(){
        System.out.println("Airport is closing");
    }
}
