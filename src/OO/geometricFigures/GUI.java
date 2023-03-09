package OO.geometricFigures;

import OO.figures.Figure;

public class GUI {
    public static void main(String[] args) {
        Figure F1 = new Figure();
        Circle Ci1 = new Circle(9);
        Circle Ci2 = new Circle(19);
        Circle Ci3 = new Circle(99);
        F1.addCircle(Ci1);
        F1.addCircle(Ci1);
        F1.addCircle(Ci1);
        Cube Cb = new Cube(9);

    }
}
