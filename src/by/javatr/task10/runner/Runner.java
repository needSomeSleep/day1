package by.javatr.task10.runner;

import static by.javatr.util.Data.*;
import static by.javatr.task10.util.Validation.*;
import static by.javatr.task10.logic.Task10Logic.*;

import by.javatr.util.InvalidDataException;

/*
Составить программу для вычисления значений функции F(x) на отрезке [а, b] с шагом h. Результат
представить в виде таблицы, первый столбец которой – значения аргумента, второй - соответствующие
значения функции.
F(x)= tg(x);
 */
public class Runner {
    public static void runner() throws InvalidDataException {
        writeMessage("Insert a, b, h: ");
        double a = readDouble();
        double b = readDouble();
        double h = readDouble();

        if (isValid(a, b, h)) {

            double temp = Math.min(a, b);
            b = Math.max(a, b);
            a = temp;

            writeMessage("  X  |  Y  ");
            writeMessage("-----------");
            while (a < b) {
                System.out.printf("%.2f | %.2f %n", a, function(a));
                a += h;
            }
        } else {
            writeMessage("Invalid data.");
        }
    }
}

