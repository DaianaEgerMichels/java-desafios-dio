package com.github.daianaegermichels.counter;
import com.github.daianaegermichels.counter.exceptions.InvalidParametersException;

import java.util.Scanner;

public class Counter {
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);
        System.out.println("Enter the first parameter");
        int firstParameter = terminal.nextInt();
        System.out.println("Enter the second parameter");
        int secondParameter = terminal.nextInt();

        try {
            counter(firstParameter, secondParameter);
        } catch (InvalidParametersException e) {
            System.out.println(e.getMessage());
        }
    }

    static void counter(int firstParameter, int secondParameter) throws InvalidParametersException {
        if (firstParameter > secondParameter) {
            throw new InvalidParametersException("The second parameter must be greater than the first");
        }

        for (int i = firstParameter; i <= secondParameter; i++) {
            System.out.println("Printing the number " + i);
        }
    }
}

