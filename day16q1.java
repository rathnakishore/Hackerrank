import java.io.*;
import java.util.*;

public class day16q1 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n>0){
            double arr[] = new double[n];
            boolean neg = false;
            for(int i=0;i<n;i++){
                arr[i]=sc.nextDouble();
                if(arr[i]<0){
                    neg = true;
                }
            }
            if(neg==false){
                int arr2[] = new int[n];
                for(int i=0;i<n;i++){
                    arr2[i] = (int)(arr[i]); 
                }
                for(int i=0;i<n;i++){
                    System.out.println(arr2[i]);
                }
            }
            else{
                System.out.print("Invalid Array Elements");
            }
        }
        else{
            System.out.print("Invalid Array Size");
        }
    }
}