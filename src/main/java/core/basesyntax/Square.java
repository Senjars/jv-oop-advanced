package core.basesyntax;

public class Square implements Figure {
    private int side;
    private final String color;

    public Square(int side, String color) {
        this.side = side;
        this.color = color;
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public void draw() {
        System.out.println("Figure: Square, area: " + getArea()
                + " units, side: " + side + " units, color: " + color);

    }
}
