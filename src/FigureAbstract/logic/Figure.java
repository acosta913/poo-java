package FigureAbstract.logic;

public abstract class Figure {
    private String color;

    public Figure(String color) {
        this.color = color;
    }

    public abstract double surface();

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
