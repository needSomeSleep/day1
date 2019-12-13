package by.javatr.task3.util;

/*
Окружность вписана в квадрат заданной площади.
Найти площадь квадрата, вписанного в эту окружность.
Во сколько раз площадь вписанного квадрата меньше площади заданного?
 */
public class Validation {
    private static final int MIN_VALUE = 0;

    public static boolean isPositive(double value) {
        return value >= MIN_VALUE;
    }
}
