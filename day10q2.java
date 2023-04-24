import java.util.Scanner;

public class day10q2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double borrowedAmount = sc.nextDouble();

        double interest = borrowedAmount * 0.1;

        double totalAmount = borrowedAmount + interest;

        double emi = totalAmount / 12;

        System.out.println((int) totalAmount + "\n" + String.format("%.2f", emi));

    }

}




