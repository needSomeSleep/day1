package by.javatr.util;

import java.util.Scanner;

public class Data {
    private static Scanner scanner = new Scanner(System.in);

    public static int readInt() throws InvalidDataException {
        if (scanner.hasNextInt())
            return scanner.nextInt();
        throw new InvalidDataException("Invalid type of input value.");
    }

    public static double readDouble() throws InvalidDataException {
        if (scanner.hasNextDouble())
            return scanner.nextDouble();
        throw new InvalidDataException("Invalid type of input value.");
    }

    public static void writeMessage(String message) {
        System.out.println(message);
    }
}
