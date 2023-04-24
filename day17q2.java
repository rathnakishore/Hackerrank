import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class day17q2 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner kl=new Scanner(System.in);
        int n=kl.nextInt();
        int arrd1[]= new int[n];
        int arrd2[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arrd1[i]=kl.nextInt();
            System.out.print(arrd1[i]+" ");
        }
         System.out.println();
        for(int i=0;i<n;i++)
        {
            arrd2[i]=arrd1[i];
            System.out.print(arrd2[i]+" ");
        }
        
    }
}