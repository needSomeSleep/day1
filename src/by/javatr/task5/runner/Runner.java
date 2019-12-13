package by.javatr.task5.runner;

import by.javatr.task5.logic.Task5Logic;
import by.javatr.task5.util.Validation;
import by.javatr.util.InvalidDataException;

import static by.javatr.util.Data.*;

/*
Составить программу, печатающую значение true, если указанное высказывание является истинным, и
false — в противном случае: является ли целое число совершенным (сумма делителей равна самому
числу)
 */
public class Runner {
    public static void runner() throws InvalidDataException {
        writeMessage("Insert positive integer number:");
        int number = readInt();

        if (Validation.isPositive(number)) {
            writeMessage("Answer: " + Task5Logic.isPerfectNumber(number));
        } else {
            writeMessage("Invalid data.");
        }
    }
}
