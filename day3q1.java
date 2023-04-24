import java.io.*;
import java.util.*;

public class day3q1 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
       Scanner sc = new Scanner(System.in);
        long accNum = sc.nextLong();
        sc.nextLine();
        String accName = sc.nextLine();
        
        char gender = sc.next().charAt(0);
        int amountToWithDrawn = sc.nextInt();
        
        int total = 20000;
        
        
        String salutation = (gender == 'M') ? "Mr." : "Ms.";
        if(amountToWithDrawn <= 20000){
        total = total-amountToWithDrawn;
        
        System.out.println("Hi"+" "+ salutation+" "+accName + "!\nYour Account Balance after withdrawl is "+ total+".");
        }
        else{
            System.out.println("Hi"+" "+salutation+" "+ accName+"!\nInsufficient Funds! You can not withdraw "+ amountToWithDrawn+".");
        }
    }
}