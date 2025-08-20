package core.basesyntax;

import java.util.Random;

public class Rectangle implements Figure {
    private int height;
    private int length;
    private final String color;


    public Rectangle(int height, int length, String color) {
        this.height = height;
        this.length = length;
        this.color = color;
    }

    @Override
    public double getArea() {
        return height * length;
    }

    @Override
    public void draw() {
        System.out.println("Figure: rectangle, area: " + getArea() + " units, height: " + height + " units, length: " + length + " units, color: " + color);
    }
}
