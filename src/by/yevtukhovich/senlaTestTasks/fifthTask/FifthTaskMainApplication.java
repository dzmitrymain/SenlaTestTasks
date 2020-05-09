package by.yevtukhovich.senlaTestTasks.fifthTask;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class FifthTaskMainApplication {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        try {
            System.out.print("Please, enter number N: ");
            int numberN = Integer.parseInt(reader.readLine());
            if (numberN >= 0 && numberN <= 100) {
                List<Integer> palindromes=findAllPalindromeNumbers(numberN);

                System.out.println("Palindromes: ");
                for (int palindrome:palindromes) {
                    System.out.println(palindrome);
                }
            } else {
                System.out.println("The entered number is not in the range from 0 to 100.");
            }
        } catch (NumberFormatException e) {
            System.out.println("The entered data is not integer.");
        }
    }

    private static List<Integer> findAllPalindromeNumbers(int numberN){
        List<Integer> palindromes=new ArrayList<>();
        for(int i=0;i<=numberN;i++){
            if(isPalindrome(String.valueOf(i))){
                palindromes.add(i);
            }
        }
        return palindromes;
    }

    private static boolean isPalindrome(String number) {
        return number.equals(new StringBuilder(number).reverse().toString());
    }

}
