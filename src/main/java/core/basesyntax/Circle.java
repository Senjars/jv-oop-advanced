package core.basesyntax;

public class Circle implements Figure {
    private int radius;
    private String color;

    Circle(int radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    @Override
    public double getArea() {
        return Math.pow(radius, 2) * Math.PI;
    }

    @Override
    public void draw() {
        System.out.println("Figure: circle, area: " + getArea()
                + " units, radius: " + radius + " units, color: " + color);
    }
}
