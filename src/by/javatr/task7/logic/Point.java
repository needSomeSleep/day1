package by.javatr.task7.logic;

/*
Даны две точки А(х1, у1) и В(х2, у2). Составить алгоритм, определяющий,
которая из точек находится ближе к началу координат. x y.
 */
public class Point {
    private double x;
    private double y;

    public Point() {
        x = 0;
        y = 0;
    }

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }
}