package by.javatr.task1.runner;

import by.javatr.util.InvalidDataException;

import static by.javatr.task1.logic.Task1Logic.*;
import static by.javatr.util.Data.*;

/*
Написать программу, позволяющую по последней цифре числа определить последнюю цифру его
квадрата.
 */
public class Runner {
    public static void runner() throws InvalidDataException {
        writeMessage("Insert integer number: ");
        int number = readInt();

        writeMessage("Last number is " + getLastDigitOfSquare(number));
    }
}
