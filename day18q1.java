import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class day18q1 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<=n-1;i++){
        arr[i]=sc.nextInt();
        }
        int x=0;
       for(int i=0;i<n;i++){ 
           x+=arr[i];
       }
        System.out.println(x);
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}