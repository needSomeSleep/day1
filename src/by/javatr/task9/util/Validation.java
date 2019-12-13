package by.javatr.task9.util;

/*
Вычислить длину окружности и площадь круга
одного и того же заданного радиуса R
 */
public class Validation {
    private static final int MIN_VALUE = 0;

    public static boolean isPositive(double value) {
        return value >= MIN_VALUE;
    }
}
