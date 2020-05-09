package by.yevtukhovich.senlaTestTasks.thirdTask;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class ThirdTaskMainApplication {

    private static final String DELIMITER = " ";

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Please, enter the sentence: ");
        String sentence = reader.readLine();

        String[] words = sentence.split(DELIMITER);
        System.out.println("Word count: " + words.length);

        Arrays.sort(words);
        firstLettersToUpperCase(words);

        System.out.println("Sorted and modified words: ");
        for (String word : words) {
            System.out.println(word);
        }
    }

    private static void firstLettersToUpperCase(String[] words) {

        for (int i = 0; i < words.length; i++) {
            if (!words[i].isEmpty()) {
                words[i] = words[i].substring(0, 1).toUpperCase() + words[i].substring(1);
            }
        }
    }
}
