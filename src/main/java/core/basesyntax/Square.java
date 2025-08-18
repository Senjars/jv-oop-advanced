package core.basesyntax;

import java.util.Random;

import static core.basesyntax.Shape.random;

public class Square implements Figure {
    private final int side = random.nextInt(11);

    public Square(int side) {
    }

    @Override
    public double areaCalculator() {
        return side * side;
    }

    @Override
    public void draw() {
        System.out.println("Figure: Square Area: " + areaCalculator() + " Side: " + side + " Color: " + ColorSupplier.getRandomColor());

    }
}
