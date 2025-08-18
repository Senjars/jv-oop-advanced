package core.basesyntax;

import static core.basesyntax.Shape.random;

public class Circle implements Figure {
    private  int radius = random.nextInt(11);

    Circle(int radius, Color white) {
        this.radius = radius;
    }

    @Override
    public double areaCalculator() {
        return Math.pow(radius, 2) * Math.PI;
    }

    @Override
    public void draw() {
        System.out.println("Figure: Circle Area: " + areaCalculator() + " Radius: " + radius + " Color: " + ColorSupplier.getRandomColor());
    }
}
