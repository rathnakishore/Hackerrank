import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        if (n < 5 || n > 15) {
            System.out.println("Invalid");
            return;
        }
        
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
        int choice = sc.nextInt();
        
        if (choice == 1) {
            Arrays.sort(arr);
        } else if (choice == 2) {
            Arrays.sort(arr);
            for (int i = 0; i < n / 2; i++) {
                int temp = arr[i];
                arr[i] = arr[n - i - 1];
                arr[n - i - 1] = temp;
            }
        } else {
            System.out.println("Invalid");
            return;
        }
        
        System.out.print(arr[0]);
        for (int i = 1; i < n; i++) {
            if (arr[i] != arr[i - 1]) {
                System.out.print(" " + arr[i]);
            }
        }
    }
}