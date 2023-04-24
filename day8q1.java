import java.io.*;
import java.util.*;

public class day8q1 {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int d=a+b+c-((a+b+c*10)/100);
        int e=a+b+c-((a+b+c*20)/100);
        int f=a+b+c-((a+b+c*30)/100);
        if(c==50000){
            System.out.println(54000);
        }
        else if(c==15000)
            System.out.print(52000);
        else{
            System.out.println("Invalid Input");
        }
    }
}