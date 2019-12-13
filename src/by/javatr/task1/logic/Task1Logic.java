package by.javatr.task1.logic;

/*
Написать программу, позволяющую по последней цифре числа
определить последнюю цифру его квадрата.
 */
public class Task1Logic {
    public static int getLastDigitOfSquare(int number) {
        int lastNumber = number * number;
        return lastNumber % 10;
    }
}
