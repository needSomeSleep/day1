package by.javatr.task4.runner;

import by.javatr.util.InvalidDataException;

import static by.javatr.util.Data.*;
import static by.javatr.task4.logic.Task4Logic.isTwoEven;

/*
Составить программу, печатающую значение true, если указанное высказывание является истинным, и
false — в противном случае: среди заданных целых чисел А, В, С, D есть хотя бы два четных.
 */
public class Runner {
    public static void runner() throws InvalidDataException {
        writeMessage("Insert 4 integer number: ");
        int a = readInt();
        int b = readInt();
        int c = readInt();
        int d = readInt();

        writeMessage("Answer: " + isTwoEven(a, b, c, d));
    }
}
