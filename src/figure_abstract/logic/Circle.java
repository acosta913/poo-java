package figure_abstract.logic;

public class Circle extends Figure {
    private int radius;

    public Circle(String color, int radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double surface() {
        return Math.PI * radius * radius;
    }
}
