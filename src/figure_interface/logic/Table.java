package figure_interface.logic;

import figure_interface.helpers.Process;

public class Table implements Process {
    private int height;
    private int width;

    public Table(int height, int width) {
        this.height = height;
        this.width = width;
    }

    @Override
    public void print() {
        System.out.println("Height: " + height + " Width: " + width);
    }

    @Override
    public void increaese(int num) {
        height += num;
        width += num;
    }

}
