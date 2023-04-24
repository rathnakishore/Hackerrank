import java.io.*;

import java.util.*;

public class day11q2 {

    public static void main(String[] args) {

       Scanner sc=new Scanner(System.in);

        int a=sc.nextInt();

        if(a>0)

        {

        for(int i=0;i<a;i++){

            for(int j=0;j<=i;j++){

               System.out.print("&");

            }

            System.out.println();

        }

        }

        else

            System.out.println("Invalid Input");

        

        

        

    }

}



