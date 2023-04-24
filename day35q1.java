import java.util.Scanner;

public class solution {

    public static void main(String[] args)
    {
        Scanner kl = new Scanner(System.in);
        
        String w1 = kl.nextLine().toLowerCase();
        
        String w2 = kl.nextLine().toLowerCase();
        
        if (w1.length() < 3 || w2.length() < 3)
        {
            System.out.println("ERROR");
        }
        else if (w1.substring(0, 3).equals(new StringBuilder(w2.substring(w2.length() - 3)).reverse().toString()))
        {
            System.out.println("GREAT");
        } 
        else
        {
            System.out.println("TRY NEXT TIME");
        }
    }

}