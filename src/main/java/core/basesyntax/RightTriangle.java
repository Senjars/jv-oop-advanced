package core.basesyntax;

public class RightTriangle extends FColorS implements Figure {
    private final int height;
    private final int base;

    public RightTriangle(int height, int base, String color) {
        super(color);
        this.height = height;
        this.base = base;
    }

    @Override
    public double getArea() {
        return 0.5 * height * base;
    }

    @Override
    public void draw() {
        System.out.println("Figure: right triangle, area: " + getArea() + " units, height: "
                + height + " units, base: " + base + " units, color: " + getColor());
    }
}
