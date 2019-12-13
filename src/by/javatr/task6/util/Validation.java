package by.javatr.task6.util;

/*
Идет n-я секунда суток, определить, сколько полных часов, полных минут и секунд прошло к этому
моменту.
 */
public class Validation {
    private static final int MIN_VALUE = 0;
    private static final int SECONDS_IN_DAY = 86400;

    public static boolean isPositive(int seconds) {
        return seconds >= MIN_VALUE;
    }

    public static boolean isMoreThanDay(int seconds) {
        return seconds > SECONDS_IN_DAY;
    }
}
