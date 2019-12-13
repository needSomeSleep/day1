package by.javatr.task9.logic;

/*
Вычислить длину окружности и площадь круга
одного и того же заданного радиуса R
 */
public class Task9Logic {
    public static double circumference(double radius) {
        return 2 * Math.PI * radius;
    }

    public static double circleArea(double radius) {
        return Math.PI * Math.pow(radius, 2);
    }
}
