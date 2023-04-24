import java.io.*;
import java.util.*;

public class day5q1 {

    public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
       
        String s = sc.nextLine();
       int c = Integer.parseInt(s,2);
        
       if(s.length()!=8 && c>=65 && c<=90)
       System.out.println((char)c);
        else{
            System.out.println("INVALID PAPER CODE");
        }
         
        
        }
    }