import java.util.Scanner;

public class WordCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String statement = sc.nextLine();
        int N = sc.nextInt();

        if (N < 1 || N > 10) {
            System.out.println("Invalid Input");
        } else {
            String[] words = statement.split("\\s+");
            int count = 0;
            for (String word : words) {
                if (word.length() == N) {
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}
