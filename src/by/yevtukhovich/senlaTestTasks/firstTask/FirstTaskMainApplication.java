package by.yevtukhovich.senlaTestTasks.firstTask;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FirstTaskMainApplication {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        try {
            System.out.print("Please, enter integer number: ");
            int number = Integer.parseInt(reader.readLine());

                String parityMessage = isEven(number) ? "even" : "odd";
                String primeOrCompositeMessage;
                if (number == 1 || number == 0) {
                    primeOrCompositeMessage = "not prime and not composite";
                } else {
                    primeOrCompositeMessage = isPrime(number) ? "prime" : "composite";
                }
                System.out.println("The entered data is " + parityMessage + ", " + primeOrCompositeMessage + " number.");

        } catch (NumberFormatException e) {
            System.out.println("The entered data is not integer.");
        }
    }

    private static boolean isPrime(int number) {

        double squareRoot = Math.sqrt(number);

        if (isInteger(squareRoot)) {
            return false;
        }
        for (int i = 2; i < squareRoot; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    private static boolean isInteger(double number) {
        return number % 1 == 0;
    }

    private static boolean isEven(int number) {
        return number % 2 == 0;
    }
}
