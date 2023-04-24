import java.io.*;
import java.util.*;

public class day9q1 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
             double red = scan.nextDouble();
    
    double blue = scan.nextDouble();
    
    double green = scan.nextDouble();

    int redFull = (int)Math.ceil(red);
    int blueFull = (int)Math.ceil(blue);
    int greenFull = (int)Math.ceil(green);

    System.out.print( + redFull+" ");
    System.out.print(+ blueFull+" ");
    System.out.print( + greenFull);
  }
}



