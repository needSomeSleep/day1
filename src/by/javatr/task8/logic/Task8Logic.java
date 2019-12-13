package by.javatr.task8.logic;

/*
Вычислить значение функции
 */
public class Task8Logic {
    public static double function(double x) {
        if (x >= 3) {
            return -(Math.pow(x, 2) + 3 * x + 9);
        } else {
            return 1 / (Math.pow(x, 3) - 6);
        }
    }
}
