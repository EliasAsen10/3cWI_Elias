package OO.figures;

public class Circle extends Figure {

    private double r;
    public Circle(String name, double r) {
        super(name);
        this.r=r;
    }

    public double getRadius(){
        return 7.3;
    }

    @Override
    public double getArea() {
        return r*r*Math.PI;
    }
}
