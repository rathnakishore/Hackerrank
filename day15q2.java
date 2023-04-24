import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class day15q2{

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner kl=new Scanner(System.in);
        int sub=kl.nextInt();
        int a=0,k=1;
        if(sub>0 && sub<=100)
            
        {
            for(int i=0;i<sub;i++)
            {
               int mar=kl.nextInt();
                if(mar!=0)
                {
                    a+=mar;
                    
                }
                
                else
                {
                     System.out.println("Invalid");
                     k=0;
                     break;
                }
            }
            if(k==1)
              System.out.println(a) ;
        }
        else{
             System.out.println("Invalid");
        }
    }
}