package core.basesyntax;

import static core.basesyntax.Shape.random;

public class ColorSupplier {
    public static Color getRandomColor() {
        int index = random.nextInt(Color.values().length);
        return Color.values()[index];
    }
}
