package core.basesyntax;

import java.util.Random;

import static core.basesyntax.Shape.random;

public class Rectangle implements Figure {

    private final int height = random.nextInt(11);
    private final int length = random.nextInt(11);

    public Rectangle(int height, int length) {
    }

    @Override
    public double areaCalculator() {
        return height * length;
    }

    @Override
    public void draw() {
        System.out.println("Figure: Rectangle Area: " + areaCalculator() + " Height: " + height + " Length: " + length + " Color: " + ColorSupplier.getRandomColor());
    }
}
