import java.io.*;
import java.util.*;

public class day3q2 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean f = false;
        for(int i=1;i<=n;i++){
         if((i*i*i) == n){
             f = true;
         }
        }
        
        if(f)
        {
          System.out.println("Perfect Cube");
        }
        else{
            System.out.println("Not Perfect Cube");
        }
    }
}