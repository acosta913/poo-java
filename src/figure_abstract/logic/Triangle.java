package figure_abstract.logic;

public class Triangle extends Figure {
    private int base;
    private int height;

    public Triangle(String color, int base, int height) {
        super(color);
        this.base = base;
        this.height = height;
    }

    @Override
    public double surface() {
        return base + height / 2;
    }

}
