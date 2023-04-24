import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner rk= new Scanner(System.in);
        int a=rk.nextInt();
        if (a>=20 && a<=200)
        {
            System.out.println("True");
        }
        else
            System.out.println("Invalid Input");
    }
}