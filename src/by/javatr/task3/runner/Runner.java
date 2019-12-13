package by.javatr.task3.runner;

import static by.javatr.task3.logic.Task3Logic.*;
import static by.javatr.task3.util.Validation.*;
import static by.javatr.util.Data.*;

import by.javatr.util.InvalidDataException;

/*
Окружность вписана в квадрат заданной площади.
Найти площадь квадрата, вписанного в эту окружность.
Во сколько раз площадь вписанного квадрата меньше площади заданного?
 */
public class Runner {
    public static void runner() throws InvalidDataException {
        writeMessage("Insert square area: ");
        double area = readDouble();

        if (isPositive(area)) {
            writeMessage("Area of inscribed square: " + squareArea(area));
            writeMessage("Difference between squares: " + differenceBetweenSquaresArea(squareArea(area), area));
        } else {
            writeMessage("Invalid data.");
        }
    }
}
