package core.basesyntax;

import java.util.Random;

public class RightTriangle implements Figure {
    private int height;
    private int base;
    private final String color;


    public RightTriangle(int height, int base, String color) {
        this.height = height;
        this.base = base;
        this.color = color;
    }

    @Override
    public double getArea() {
        return 0.5 * height * base;
    }

    @Override
    public void draw() {
        System.out.println("Figure: right triangle, area: " + getArea() + " units, height: " + height + " units, base: " + base + " units, color: " + color);
    }
}
