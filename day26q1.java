import java.util.Scanner;

public class ArraySumOrProduct {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int size = input.nextInt();

        if (size < 0) {
            System.out.println("Invalid Array Size");
        } else {
           
            int[] arr = new int[size];
            for (int i = 0; i < size; i++) 
            {
                arr[i] = input.nextInt();
            }

          
            int choice = input.nextInt();

        
            if (choice == 1) {
                int sum = 0;
                for (int i = 0; i < size; i++) {
                    sum += arr[i];
                }
                System.out.println(sum);
            } else if (choice == 2) {
                int product = 1;
                for (int i = 0; i < size; i++) {
                    product *= arr[i];
                }
                System.out.println(product);
            } else {
                System.out.println("Wrong Choice");
            }
        }

        input.close();
    }
}
