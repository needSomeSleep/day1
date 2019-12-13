package by.javatr.task2.logic;

/*
Составить программу, которая по заданным году и номеру месяца определяет количество дней в этом
месяце и корректно определялись все високосные года.
 */
public class Task2Logic {
    public static int daysInMonth(int year, int month) {
        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                return 31;
            case 4:
            case 6:
            case 9:
            case 11:
                return 30;
            default:
                return isLeap(year) ? 29 : 28;
        }
    }

    private static boolean isLeap(int year) {
        if (year % 400 == 0) {
            return true;
        } else if (year % 100 == 0) {
            return false;
        } else return year % 4 == 0;
    }
}
