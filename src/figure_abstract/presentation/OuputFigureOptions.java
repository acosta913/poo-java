package figure_abstract.presentation;

import figure_abstract.logic.Circle;
import figure_abstract.logic.Figure;
import figure_abstract.logic.Triangle;

public class OuputFigureOptions {

    public  void showFigure(Figure figure) {
        System.out.println("Color: " + figure.getColor());
        System.out.println("Superficie: " + figure.surface());
        // showFigure(new Triangle("Morado", 4, 8));
        // showFigure(new Circle("Verde", 3));
    }

}
