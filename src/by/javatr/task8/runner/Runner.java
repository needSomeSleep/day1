package by.javatr.task8.runner;

import by.javatr.util.InvalidDataException;

import static by.javatr.util.Data.*;
import static by.javatr.task8.logic.Task8Logic.*;

/*
Вычислить значение функции
 */
public class Runner {
    public static void runner() throws InvalidDataException {
        writeMessage("Insert X: ");
        double x = readDouble();

        writeMessage("F(" + x + ")=" + function(x));
    }
}
