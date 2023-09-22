package OO.Airplane;

public class Swissairplane extends Airplane{


    public Swissairplane(int height, int span, String colour, int id, int maxspeed, int weidht, int seatingplaces, Engine engine, Tank tank) {
        super(height, span, colour, id, maxspeed, weidht, seatingplaces, engine, tank);
    }

    public void flyfast(){
        System.out.println("Fastmode is avtive");

    }


}


