package OO.Airplane;

import java.util.ArrayList;
import java.util.List;

public class Airport {

    private List<Hanger> hangers;
    private int weidht;
    private int lenght;
    private int anzahlhangers = 10;


    public Airport(int weidht, int lenght) {
        this.weidht = weidht;
        this.lenght = lenght;
        this.hangers =  new ArrayList<>();
    }

    public List<Hanger> getHangers() {
        return hangers;
    }

    public void setHangers(Hanger hanger) {
        if (this.hangers.size() > anzahlhangers)
        {
            System.out.println("Kein Platz auf dem Flughafen");
        } else {
            this.hangers.add(hanger);

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
