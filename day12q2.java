import java.util.Scanner;

public class day12q2 {

   public static void main(String[] args) {

      Scanner sc = new Scanner(System.in);

      int n = sc.nextInt();

      int op = sc.nextInt();

      int fact = 1;

      boolean prime = true;

      if (op == 1) {

         if (n % 2 == 0) {

            System.out.println("YEs");

         } else {

            System.out.println("NO");

         }

      } else if (op == 2) {

         if (n % 2 != 0) {

            System.out.println("YES");

         } else {

            System.out.println("NO");

         }

      } else if (op == 3) {

         for (int i = 2; i <= n / 2; i++) {

            if (n % i == 0) {

               prime = false;

               break;

            }

         }

         if (prime) {

            System.out.println("YES");

         } else {

            System.out.println("NO");

         }

      } else if (op == 4) {

         for (int i = 1; i <= n; i++) {

            fact = fact * i;

         }

         System.out.println(fact);

      }

   }

}



