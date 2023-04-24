import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
       Scanner kl=new Scanner(System.in);
        int n=kl.nextInt();
        if(n>2)
        {
            String as[]=new String[n];
            int i=0;
            while(i<n)
            {
                as[i]=kl.next();
                i++;
                
            }
            Arrays.sort(as);
            for(String sor:as)
            {
                System.out.println(sor);
            }
            
        }
        else 
        {
            System.out.println("Invalid");
        }
        
    }
}