package week3;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Ex60 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> words = new ArrayList<>();

        System.out.println("Type a word (or press Enter to finish):");
        while (true) {
            String input = scanner.nextLine().trim();
            if (input.isEmpty()) {
                break;
            }
            words.add(input);
            System.out.println("Type a word (or press Enter to finish):");
        }

        if (words.isEmpty()) {
            System.out.println("You didn't type any words.");
        } else {
            Collections.sort(words);
            System.out.println("\nYou typed the following words in alphabetical order:");
            for (String word : words) {
                System.out.println(word);
            }
        }

        scanner.close();
    }
}
