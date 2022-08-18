package com.jap.fibonacci;

/**
 * The FibonacciSeries class has a main method that calls the printFibonacciSeries method and passes the value 9
 */
public class FibonacciSeries {
    public static void main(String[] args) {
        FibonacciSeries fibonacciSeries = new FibonacciSeries();
        int number = 9;
        // Call the  printFibonacciSeries() method and pass the value.
        fibonacciSeries.printFibonacciSeries(number);
    }
    // Write the logic in the method to generate the next number in the Fibonacci series

    /**
     * If the number is less than zero, return -1. If the number is zero, return 0. If the number is 1 or 2, return 1.
     * Otherwise, return the sum of the previous two numbers
     *
     * @param number The number to calculate the fibonacci number for.
     * @return The nth number in the Fibonacci sequence.
     */
    public long fibonacci(long number) {
        if (number == 0) {
            return 0;
        }
        if (number == 1 || number == 2) {
            return 1;
        }
        if (number < -1) {
            return -1;
        } else {
            return fibonacci(number - 1) + fibonacci(number - 2);
        }
    }

    // Printing the fibonacci series.
    public void printFibonacciSeries(long number) {
        for (int i = 0; i < number; i++) {
            System.out.print(fibonacci(i) + " ");
        }
    }
}

