package by.javatr.task3.logic;

/*
Окружность вписана в квадрат заданной площади. Найти площадь квадрата, вписанного в эту
окружность. Во сколько раз площадь вписанного квадрата меньше площади заданного?
 */
public class Task3Logic {
    public static double squareArea(double roundSquare) {
        double diameter = Math.sqrt(roundSquare);
        return (Math.pow(diameter, 2)) / 2;
    }

    public static double differenceBetweenSquaresArea(double area1, double area2) {
        return area1 / area2;
    }
}
