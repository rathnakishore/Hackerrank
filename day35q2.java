import java.util.Arrays;
import java.util.Scanner;

public class solution {
    
    public static void main(String[] args) {
        Scanner kl = new Scanner(System.in);
        String str1 = kl.nextLine();
        String str2 = kl.nextLine();
        
        if (str1.length() <= 2 || str2.length() <= 2)
        {
            System.out.println("Invalid Input");
            return;
        }
          
        char[] c1 = str1.toCharArray();
        char[] c2 = str2.toCharArray();
        Arrays.sort(c1);
        Arrays.sort(c2);
        
        if (Arrays.equals(c1, c2))
        {
            System.out.println("ANAGRAM");
        } else
        {
            System.out.println("NOT ANAGRAM");
        }
        
    }
    
}