package assignment9;


import java.util.Scanner;
import java.util.regex.*;

public class SentenceChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String sentence = "";

        String pattern = "^[A-Z].*[\\.\\?!][\\s]*$";
        Pattern r = Pattern.compile(pattern);

        while (true) {
            System.out.println("Enter a sentence or 'q' to quit:");
            sentence = scanner.nextLine();

            if (sentence.equals("q")) {
                break;
            }

            Matcher m = r.matcher(sentence);

            if (m.find()) {
                System.out.println("The sentence is valid.");
            } else {
                System.out.println("The sentence is invalid.");
            }
        }
    }
}

