package OO.calculators;

public class Main {
    public static void main(String[] args) {
        calculator c1 = new calculator();
        rootCalculator rc = new rootCalculator();
        scienceCalculator sc = new scienceCalculator();

        c1.add(1,4);
        rc.sinus(10);
        sc.rootfrom(9);


    }
}
