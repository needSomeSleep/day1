package by.javatr.task6.logic;

/*
Идет n-я секунда суток, определить, сколько полных часов,
полных минут и секунд прошло к этому моменту.
 */
public class Task6Logic {
    public static int countOfHours(int seconds) {
        seconds %= 86400;
        return seconds / 3600;
    }

    public static int countOfMinutes(int seconds) {
        seconds %= 86400;
        return (seconds % 3600) / 60;
    }

    public static int countOfSeconds(int seconds) {
        seconds %= 86400;
        return seconds % 60;
    }
}
