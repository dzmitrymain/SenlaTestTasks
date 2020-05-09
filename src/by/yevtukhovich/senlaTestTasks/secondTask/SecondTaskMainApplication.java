package by.yevtukhovich.senlaTestTasks.secondTask;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SecondTaskMainApplication {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        try {
            System.out.print("Please, enter the first integer number: ");
            int firstNumber = Integer.parseInt(reader.readLine());
            System.out.print("Please, enter the second integer number: ");
            int secondNumber = Integer.parseInt(reader.readLine());

            System.out.println("The greatest common divisor: "+findGreatestCommonDivisor(firstNumber,secondNumber));
            System.out.println("The lowest common multiple: "+findLowestCommonMultiple(firstNumber,secondNumber));

        } catch (NumberFormatException e) {
            System.out.println("The entered data is not integer.");
        }
    }

    private static int findGreatestCommonDivisor(int firstNumber,int secondNumber){
        if (secondNumber == 0) {
            return firstNumber;
        }
        else {
            return findGreatestCommonDivisor(secondNumber, firstNumber % secondNumber);
        }
    }

    private static int findLowestCommonMultiple(int firstNumber, int secondNumber) {
        return firstNumber/findGreatestCommonDivisor(firstNumber,secondNumber)*secondNumber;
    }
}
