package OO.figures;

public class Rectangle extends Figure {

    private double a;
    private double b;

    public Rectangle(String name, double a, double b) {
        super(name);
        this.a= a;
        this.b= b;
    }

    @Override
    public double getArea() {
        return a*b;
    }
}
