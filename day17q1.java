import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.util.Arrays;

public class day17q1 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Scanner kl= new Scanner(System.in);
        int N=kl.nextInt();
        
        if(N<0)
        {
            System.out.println("Invalid Array Elements");
           return;
            
        }
        int arr[]=new int[N];
        for(int i=0;i<N;i++){
            arr[i]=kl.nextInt();
            if(arr[i]<0)
            {
                 System.out.println("Invalid Array Size");
                break;
            }
            
        }
        Arrays.sort(arr);
        if(arr.length<2)
        {
             System.out.println("Invalid Array Elements");
        }
        else{
            int secl=arr[arr.length-2];
             System.out.println(secl);
        }
    }
}