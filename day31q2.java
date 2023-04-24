import java.util.Scanner;

public class day31q2 {
    public static void main(String[] args) {
        Scanner pr = new Scanner(System.in);
        int n = pr.nextInt();
        if (n < 10 || n > 500) {
            System.out.println("Invalid Input");
        } else {
            if (check(n)) {
                System.out.println("True");
            } else {
                System.out.println("False");
            }
        }
        pr.close();
    }
    
    public static boolean check(int n) {
        return n % 2 == 0 && n % 13 == 0;
    }
}