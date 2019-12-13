package by.javatr.task2.util;

/*
Составить программу, которая по заданным году и номеру месяца
определяет количество дней в этом
месяце и корректно определялись все високосные года.
 */
public class Validation {
    private static final int MIN_YEAR = 0;
    private static final int MIN_MONTH = 1;
    private static final int MAX_MONTH = 12;

    public static boolean isValidDate(int year, int month) {
        return isValidMonth(month) && isValidYear(year);
    }

    private static boolean isValidMonth(int month) {
        return month <= MAX_MONTH && month >= MIN_MONTH;
    }

    private static boolean isValidYear(int year) {
        return year >= MIN_YEAR;
    }
}
