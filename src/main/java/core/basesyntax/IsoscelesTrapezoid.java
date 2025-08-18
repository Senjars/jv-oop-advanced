package core.basesyntax;

import static core.basesyntax.Shape.random;

public class IsoscelesTrapezoid implements Figure {
    private final int longerSide = random.nextInt(11);
    private final int shorterSide = random.nextInt(11);
    private final int height = random.nextInt(11);

    public IsoscelesTrapezoid(int longerSide, int shorterSide, int height) {
    }

    @Override
    public double areaCalculator() {
        return (longerSide + shorterSide) * height * 0.5;
    }

    @Override
    public void draw() {
        System.out.println("Figure: IsoscelesTrapezoid Area: " + areaCalculator() + " lognerSide: " + longerSide + " shorterSide: " + shorterSide + " height: " + height + " Color: " + ColorSupplier.getRandomColor());
    }
}
