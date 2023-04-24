import java.io.*;
import java.util.*;

public class CharacterFrequencyCounter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputString = scanner.nextLine();

        if(inputString.length() > 5) {
            int[] characterFrequencies = new int[256]; 

            // Count the frequency of each character in the input string
            for(char c : inputString.toCharArray()) {
                characterFrequencies[c]++;
            }

            // Print out the characters and their frequencies
            for(int i = 0; i < characterFrequencies.length; i++) {
                if(characterFrequencies[i] > 0) {
                    System.out.print("" + (char) i + "" + characterFrequencies[i]);
                }
            }
        } else {
            System.out.println("Invalid input: the input string must be longer than 5 characters.");
        }
    }
}
