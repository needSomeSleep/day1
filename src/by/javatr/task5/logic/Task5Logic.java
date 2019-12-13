package by.javatr.task5.logic;

/*
Составить программу, печатающую значение true, если указанное высказывание является истинным, и
false — в противном случае: является ли целое число совершенным (сумма делителей равна самому
числу)
 */
public class Task5Logic {
    public static boolean isPerfectNumber(int number) {
        return number == sumOfDividers(number);
    }

    private static int sumOfDividers(int number) {
        int sum = 0;
        for (int j = 1; j < number; j++) {
            if (number % j == 0) {
                sum += j;
            }
        }
        return sum;
    }
}
