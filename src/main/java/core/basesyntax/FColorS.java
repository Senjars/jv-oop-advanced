package core.basesyntax;

public abstract class FColorS implements Figure, Drawable {
    private final String color;

    protected FColorS(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }
}
