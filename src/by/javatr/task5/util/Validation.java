package by.javatr.task5.util;

/*
Составить программу, печатающую значение true, если указанное высказывание является истинным, и
false — в противном случае: является ли целое число совершенным (сумма делителей равна самому
числу)
 */
public class Validation {
    private static final int MIN_VALUE = 0;

    public static boolean isPositive(int number) {
        return number >= MIN_VALUE;
    }
}
