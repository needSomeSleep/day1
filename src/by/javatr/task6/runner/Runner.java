package by.javatr.task6.runner;

import static by.javatr.task6.util.Validation.*;
import static by.javatr.util.Data.*;
import static by.javatr.task6.logic.Task6Logic.*;

import by.javatr.util.InvalidDataException;

/*
Идет n-я секунда суток, определить, сколько полных часов,
полных минут и секунд прошло к этому моменту.
 */
public class Runner {
    public static void runner() throws InvalidDataException {
        writeMessage("Insert seconds :");
        int seconds = readInt();

        if (isPositive(seconds)) {
            if (isMoreThanDay(seconds)) {
                writeMessage("Entered more seconds that in day. Value will be divided by 86400.");
            }
            writeMessage("Passed: " + countOfHours(seconds) + ":" + countOfMinutes(seconds) + ":" + countOfSeconds(seconds));
        } else {
            writeMessage("Invalid data.");
        }
    }
}
