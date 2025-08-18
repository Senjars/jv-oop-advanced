package core.basesyntax;

import java.util.Arrays;

public class Main {
    public static void main (String[] args) {
        Figure[] figures = new Figure[6];

        for (int i = 0; i < figures.length / 2; i++) {
            figures[i] = FigureSupplier.getRandomFigure();
        }

        for (int i = figures.length / 2; i < figures.length; i++) {
            figures[i] = FigureSupplier.getDefaultFigure();
        }

        String we = Arrays.toString(figures);
        for (int i = 0; i < figures.length; i++) {
            figures[i].draw();
        }
    }
}
