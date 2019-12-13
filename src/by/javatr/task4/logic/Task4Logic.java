package by.javatr.task4.logic;

/*
Составить программу, печатающую значение true, если указанное высказывание является истинным, и
false — в противном случае: среди заданных целых чисел А, В, С, D есть хотя бы два четных.
 */
public class Task4Logic {
    public static boolean isTwoEven(int a, int b, int c, int d) {
        int[] numbers = {a, b, c, d};

        int countOfEven = 0;
        for (int n : numbers) {
            if (n % 2 == 0 && n != 0) {
                countOfEven++;
            }
        }
        return countOfEven > 1;
    }
}
