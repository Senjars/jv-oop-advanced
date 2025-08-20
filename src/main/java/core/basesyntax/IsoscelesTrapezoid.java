package core.basesyntax;

public class IsoscelesTrapezoid implements Figure {
    private final String color;
    private int longerSide;
    private int shorterSide;
    private int height;

    public IsoscelesTrapezoid(int longerSide, int shorterSide, int height, String color) {
        this.height = height;
        this.shorterSide = shorterSide;
        this.longerSide = longerSide;
        this.color = color;
    }

    @Override
    public double getArea() {
        return (longerSide + shorterSide) * height * 0.5;
    }

    @Override
    public void draw() {
        System.out.println("Figure: isosceles trapezoid, area: " + getArea() + " units, lognerSide: "
                + longerSide + " units, shorterSide: " + shorterSide + " units, height: "
                + height + " units, color: " + color);
    }
}
