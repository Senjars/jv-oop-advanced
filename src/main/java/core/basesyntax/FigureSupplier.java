package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        int randomFigure = random.nextInt(5);
        String color = colorSupplier.getRandomColor().name();

        switch (randomFigure) {
            case 0:
                return new Square(random.nextInt(11),
                        color);
            case 1:
                return new IsoscelesTrapezoid(random.nextInt(11),
                        random.nextInt(11),
                        random.nextInt(11),
                        color);
            case 2:
                return new RightTriangle(random.nextInt(11),
                        random.nextInt(11),
                        color);
            case 3:
                return new Rectangle(random.nextInt(11),
                        random.nextInt(11),
                        color);
            case 4:
                return new Circle(random.nextInt(11),
                        color);
            default:
                return getDefaultFigure();
        }
    }
    public Figure getDefaultFigure() {
        return new Circle(10, "WHITE");
    }
}
