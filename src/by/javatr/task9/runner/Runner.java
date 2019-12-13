package by.javatr.task9.runner;

import static by.javatr.util.Data.*;
import static by.javatr.task9.logic.Task9Logic.*;
import static by.javatr.task9.util.Validation.*;

import by.javatr.util.InvalidDataException;

/*
Вычислить длину окружности и площадь круга
одного и того же заданного радиуса R
 */
public class Runner {
    public static void runner() throws InvalidDataException {
        writeMessage("Insert radius: ");
        double radius = readDouble();

        if (isPositive(radius)) {
            writeMessage("Circle area: " + circleArea(radius));
            writeMessage("Circumference: " + circumference(radius));
        } else {
            writeMessage("Radius should be positive.");
        }
    }
}
