package core.basesyntax;

public class IsoscelesTrapezoid extends FColorS implements Figure {
    private final int longerSide;
    private final int shorterSide;
    private final int height;

    public IsoscelesTrapezoid(int longerSide, int shorterSide, int height, String color) {
        super(color);
        this.height = height;
        this.shorterSide = shorterSide;
        this.longerSide = longerSide;
    }

    @Override
    public double getArea() {
        return (longerSide + shorterSide) * height * 0.5;
    }

    @Override
    public void draw() {
        System.out.println("Figure: isosceles trapezoid, area: "
                + getArea() + " units, lognerSide: "
                + longerSide + " units, shorterSide: " + shorterSide + " units, height: "
                + height + " units, color: " + getColor());
    }
}
