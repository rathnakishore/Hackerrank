import java.io.*;
import java.util.*;

class employee {
    int id;
    int age;

    employee(int i, int a) {
        id = i;
        age = a;
    }

    void display() {
        System.out.println(id + " " + age);

    }

}

public class Solution {

    public static void main(String[] args) {
        /*
         * Enter your code here. Read input from STDIN. Print output to STDOUT. Your
         * class should be named Solution.
         */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n >= 1 && n <= 10) {
            employee e[] = new employee[n];
            boolean b = true;
            for (int i = 0; i < n; i++) {
                int id = sc.nextInt();
                int a = sc.nextInt();
                if ((id >= 10 && id <= 1000) && (a >= 18 && a <= 50)) {
                    e[i] = new employee(id, a);

                } else {
                    System.out.print("Invalid data");
                    b = false;
                    break;
                }

            }
            if (b == true) {
                int min=0;
                for (int i = 0; i < n; i++) {
                    if (e[i].age < 30) {
                        min=i;
                    }
                }
                e[min].display();
            }

        } else {
            System.out.print("Invalid input");
        }
    }
}