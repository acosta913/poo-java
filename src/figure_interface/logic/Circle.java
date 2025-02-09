package figure_interface.logic;

import figure_interface.helpers.Process;

public class Circle extends Figure implements Process {
    private int radius;

    public Circle(String color, int radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double surface() {
        return Math.PI * radius * radius;
    }

    @Override
    public void print() {
        System.out.println("The radius: " + radius);

    }

    @Override
    public void increaese(int num) {
        radius += num;

    }
}
