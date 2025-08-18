package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    static Random random = new Random();
    public static Figure getRandomFigure() {
        int randomFigure = random.nextInt(5);

        switch (randomFigure) {
            case 0: return new Square(random.nextInt(11));
            case 1: return new IsoscelesTrapezoid(random.nextInt(11),random.nextInt(11),random.nextInt(11));
            case 2: return new RightTriangle(random.nextInt(11),random.nextInt(11));
            case 3: return new Rectangle(random.nextInt(11),random.nextInt(11));
            case 4: return new Circle(random.nextInt(11), Color.WHITE);
            default: return getDefaultFigure();
        }
    }
    public static Figure getDefaultFigure() {
        return new Circle(10, Color.WHITE);
    }
}
