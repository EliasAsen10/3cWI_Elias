package OO.geometricFigures;

public class Cube implements Area{
    public double a;

    public Cube(double a) {
        this.a = a;
    }

    @Override
    public double getArea() {
        return this.a*this.a;
    }
}
