package core.basesyntax;

public abstract class FColorS {
    private final String color;

    protected FColorS(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }
}
