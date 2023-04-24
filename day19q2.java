import java.util.Arrays;
import java.util.Scanner;

public class day19q2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // read the products purchased by Jasmine and store them in an array
        String[] jasmineProducts = new String[4];
        for (int i = 0; i < 4; i++) {
            jasmineProducts[i] = scanner.next();
        }

        // read the products purchased by Jack and store them in an array
        String[] jackProducts = new String[4];
        for (int i = 0; i < 4; i++) {
            jackProducts[i] = scanner.next();
        }

        // sort the arrays to make comparison easier
        Arrays.sort(jasmineProducts);
        Arrays.sort(jackProducts);

        // count the number of similar products in the two arrays
        int count = 0;
        for (int i = 0; i < 4; i++) {
            if (jasmineProducts[i].equals(jackProducts[i])) {
                count++;
            }
        }

        // print the result
        System.out.println(count);
    }
}
