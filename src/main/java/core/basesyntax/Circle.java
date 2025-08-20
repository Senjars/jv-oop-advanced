package core.basesyntax;

public class Circle extends FColorS implements Figure {
    private final int radius;

    Circle(int radius, String color) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.pow(radius, 2) * Math.PI;
    }

    @Override
    public void draw() {
        System.out.println("Figure: circle, area: " + getArea()
                + " units, radius: " + radius + " units, color: " + getColor());
    }
}
