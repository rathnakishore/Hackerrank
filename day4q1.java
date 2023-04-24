import java.io.*;
import java.util.*;

public class day4q1 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    Scanner sc= new Scanner(System.in);
        int a=sc.nextInt();
        int b= sc.nextInt();
        int c=a*4;
        int d=b*6;
        if(a>0){
            if(b>0)
                System.out.println(c+d);
        
        }else
        {
            System.out.print("thank you");
        }
    }
}