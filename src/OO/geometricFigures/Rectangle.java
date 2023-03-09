package OO.geometricFigures;

public class Rectangle implements Area {
    public double widht;
    public double lenght;

    public Rectangle (double widht, double lenght) {
        this.widht = widht;
        this.lenght = lenght;
    }

    @Override
    public double getArea() {
        return this.widht*this.lenght;
    }
}

