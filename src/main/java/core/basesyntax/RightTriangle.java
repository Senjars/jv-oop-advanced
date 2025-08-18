package core.basesyntax;

import static core.basesyntax.Shape.random;

public class RightTriangle implements Figure {
    private final int height = random.nextInt(11);
    private final int base = random.nextInt(11);

    public RightTriangle(int height, int base) {
    }

    @Override
    public double areaCalculator() {
        return 0.5 * height * base;
    }

    @Override
    public void draw() {
        System.out.println("Figure: RightTriangle Area: " + areaCalculator() + " Height: " + height + " Base: " + base + " Color: " + ColorSupplier.getRandomColor());
    }
}
