package by.javatr.task7.logic;

/*
Даны две точки А(х1, у1) и В(х2, у2). Составить алгоритм, определяющий,
которая из точек находится ближе к началу координат. x y.
 */
public class Task7Logic {

    public static Point nearestPoint(Point point1, Point point2, Point point) {
        return (distanceBetweenPoints(point1, point) < distanceBetweenPoints(point2, point)) ? point1 : point2;
    }

    private static double distanceBetweenPoints(Point point1, Point point2) {
        return Math.abs(Math.sqrt(Math.pow((point1.getX() - point2.getX()), 2)
                + Math.pow((point1.getY() - point2.getY()), 2)));
    }
}