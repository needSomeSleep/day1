package by.javatr.task7.runner;

import static by.javatr.util.Data.*;
import static by.javatr.task7.logic.Task7Logic.*;

import by.javatr.task7.logic.Point;
import by.javatr.util.InvalidDataException;

/*
Даны две точки А(х1, у1) и В(х2, у2). Составить алгоритм, определяющий,
которая из точек находится ближе к началу координат. x y.
 */
public class Runner {
    public static void runner() throws InvalidDataException {
        writeMessage("Insert x1, y1: ");
        Point point1 = new Point(readDouble(), readDouble());

        writeMessage("Insert x2, y2: ");
        Point point2 = new Point(readDouble(), readDouble());

        Point nearestPoint = nearestPoint(point1, point2, new Point(0, 0));
        writeMessage("The nearest point is: " + nearestPoint);
    }
}
