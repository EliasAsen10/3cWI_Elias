package OO.Airplane;

public class Main {
    public static void main(String[] args) {
        Engine e1 = new Engine(190, Engine.TYPE.DIESEL);
        Engine e2 = new Engine(190, Engine.TYPE.DIESEL);
        Engine e3 = new Engine(190, Engine.TYPE.DIESEL);
        Tank t1 = new Tank(100,99);
        Tank t2 = new Tank(120,110);
        Tank t3 = new Tank(120,110);
        Airplane a1 = new Airplane(100,100,"rot",1,200,100,199,e1,t1);
        Airplane a2 = new Airplane(130,100,"grün",1,203,110,199,e2,t2);
        Airport aa1= new Airport(100,100);
        Hanger h1 = new Hanger(100,200);
        h1.setAirplanes(a1);
        h1.setAirplanes(a2);
        aa1.setHangers(h1);
        Swissairplane s1 = new Swissairplane(100,100,"schwarz",29,100,110,299,e3,t3);
        h1.setAirplanes(s1);

        System.out.println(h1.getAirplanes());
        System.out.println(aa1.getHangers());
        h1.infoAirplanes();


    }
}
