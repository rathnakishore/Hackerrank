import java.io.*;
import java.util.*;

public class day16q2 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n>0 && n<=5){
            while(n!=0){
                int k=7;
                int total = 0;
                for(int i=0;i<k;i++){
                    int num = sc.nextInt();
                    total = total+num;
                }
                if(total == 56){
                    System.out.println(1);
                }
                else{
                    System.out.println(0);
                }
                n--;
            }
        }
    }
}