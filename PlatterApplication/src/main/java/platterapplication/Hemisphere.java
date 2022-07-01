package platterapplication;

public class Hemisphere {

    private double radius;

    public Hemisphere(double radius) {
        this.radius = radius;
    }

    public double getVolume() {
        return (2 * 3.14 * radius * radius * radius) / 3;
    }
}
