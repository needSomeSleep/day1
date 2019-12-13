package by.javatr.task2.runner;

import static by.javatr.task2.logic.Task2Logic.*;
import static by.javatr.task2.util.Validation.*;
import static by.javatr.util.Data.*;

import by.javatr.util.InvalidDataException;

/*
Составить программу, которая по заданным году и номеру месяца
определяет количество дней в этом
месяце и корректно определялись все високосные года.
 */
public class Runner {
    public static void runner() throws InvalidDataException {
        writeMessage("Insert year: ");
        int year = readInt();
        writeMessage("Insert month: ");
        int month = readInt();

        if (isValidDate(year, month)) {
            writeMessage("Days in month: " + daysInMonth(year, month));
        } else {
            writeMessage("Invalid data.");
        }
    }
}
