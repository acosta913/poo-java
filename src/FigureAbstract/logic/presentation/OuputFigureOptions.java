package FigureAbstract.logic.presentation;

import FigureAbstract.logic.Circle;
import FigureAbstract.logic.Figure;
import FigureAbstract.logic.Triangle;

public class OuputFigureOptions {

    public  void showFigure(Figure figure) {
        System.out.println("Color: " + figure.getColor());
        System.out.println("Superficie: " + figure.surface());
        // showFigure(new Triangle("Morado", 4, 8));
        // showFigure(new Circle("Verde", 3));
    }

}
