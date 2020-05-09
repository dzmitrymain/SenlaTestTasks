package by.yevtukhovich.senlaTestTasks.fourthTask;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FourthTaskMainApplication {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Please, enter the text: ");
        String text=reader.readLine();

        System.out.print("Please, enter the word: ");
        String word=reader.readLine();

        int wordCount=0;

        Pattern pattern=Pattern.compile(word.toLowerCase());
        Matcher matcher=pattern.matcher(text.toLowerCase());

        while (matcher.find()){
            wordCount++;
        }

        System.out.println("Word frequency: "+wordCount);
    }
}
