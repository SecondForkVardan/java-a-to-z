package ru.kovladimir.calculator;

import java.util.Scanner;

/**
 * Console input.
 */
public class ConsoleInput implements Input {

    /**
     * Scanner to interact with user by console.
     */
    private Scanner scanner = new Scanner(System.in);

    /**
     * {@inheritDoc}
     * @return String.
     */
    public String askString() {
        return scanner.nextLine();
    }
}
