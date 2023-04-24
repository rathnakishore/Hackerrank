import java.io.*;
import java.util.*;

public class day1q2 {

    public static void main(String[] args) {
        int a;
        int b;
        int c;
        //float k=3.0f;
        Scanner sc= new Scanner(System.in);
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        float f = 3.0f;
        double d =(double) (a+b+c)/3.0;
//          String sValue = (String) String.format("%.1f", d);
//          Double newValue = Double.parseDouble(sValue);
       double ans = truncateTo(d,1);
        System.out.println(ans);
        
    }
    static double truncateTo( double unroundedNumber, int decimalPlaces ){
    int truncatedNumberInt = (int)( unroundedNumber * Math.pow( 10, decimalPlaces ) );
    double truncatedNumber = (double)( truncatedNumberInt / Math.pow( 10, decimalPlaces ) );
    return truncatedNumber;
}
}