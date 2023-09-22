package OO.Airplane;

public class Airplane {
    private int height;
    private int span;
    private String colour;
    private int id;
    private int maxspeed;
    private int weidht;
    private int seatingplaces;

    private Engine engine;

    private Tank tank;


    private boolean autopilot;

    public Airplane(int height, int span, String colour, int id, int maxspeed, int weidht, int seatingplaces, Engine engine, Tank tank) {
        this.height = height;
        this.span = span;
        this.colour = colour;
        this.id = id;
        this.maxspeed = maxspeed;
        this.weidht = weidht;
        this.seatingplaces = seatingplaces;
        this.engine = engine;
        this.tank = tank;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getSpan() {
        return span;
    }

    public void setSpan(int span) {
        this.span = span;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getMaxspeed() {
        return maxspeed;
    }

    public void setMaxspeed(int maxspeed) {
        this.maxspeed = maxspeed;
    }

    public int getWeidht() {
        return weidht;
    }

    public void setWeidht(int weidht) {
        this.weidht = weidht;
    }

    public int getSeatingplaces() {
        return seatingplaces;
    }

    public void setSeatingplaces(int seatingplaces) {
        this.seatingplaces = seatingplaces;
    }

    public boolean isAutopilot() {
        return autopilot;
    }

    public void setAutopilot(boolean autopilot) {
        this.autopilot = autopilot;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public Tank getTank() {
        return tank;
    }

    public void setTank(Tank tank) {
        this.tank = tank;
    }



    public void autopilot(){
        if (this.autopilot==false){
            System.out.println("Autopilot is off");
        } else
        {
            System.out.println("Autopilot is on");
        }
    }

    public void start(){
        System.out.println("Airplane is starting");
    }
}
