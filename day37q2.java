import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if (isValid(a, b)) {
            System.out.println(isBigger(a, b));
        } else {
            System.out.println("Invalid Input");
        }
    }
    
    public static boolean isValid(int a, int b) {
        return a >= 10 && a <= 1000 && b >= 10 && b <= 1000;
    }
    
    public static boolean isBigger(int a, int b) {
        return a > b;
    }
}
