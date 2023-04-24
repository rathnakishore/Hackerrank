import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner kl=new Scanner(System.in);
        String s1=kl.nextLine();
        int [] farr=new int[128];
        for(int i=0;i<s1.length();i++)
        {
            char c=s1.charAt(i);
            if(Character.isLetterOrDigit(c))
            {
                farr[c]++;
            }
            else
            {
                System.out.println("Error");
                return;
            }
        }
        int mf=0;
        char mc=' ';
        for(int i=0;i<farr.length;i++)
        {
            if(farr[i]>mf)
            {
                mf=farr[i];
                mc=(char)i;
                
            }
        }
        System.out.println("Maximum occurring character is:"+" "+mc);
    }
}