import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

//import java.util.Scanner;

class Complex {
    private int real;
    private int imaginary;
    
    // Constructor with no arguments
    public Complex() {
        this.real = 0;
        this.imaginary = 0;
    }
    
    // Constructor with two arguments
    public Complex(int real, int imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }
    
    // Method to multiply two complex numbers
    public Complex Mul_Complex(Complex num1, Complex num2) {
        int realPart = (num1.real * num2.real) - (num1.imaginary * num2.imaginary);
        int imaginaryPart = (num1.real * num2.imaginary) + (num2.real * num1.imaginary);
        Complex result = new Complex(realPart, imaginaryPart);
        return result;
    }
    
    // Method to display a complex number in the format "a+bi"
    public void Display() {
        if (real<1 && imaginary < 1) {
            System.out.println(real + "" + imaginary + "i");
        } else {
            System.out.println(real + "+" + imaginary + "i");
        }
    }
}

public class Test_Complex {
    public static void main(String[] args) {
        Scanner kl = new Scanner(System.in);
        //System.out.print("Enter the real part of the first complex number: ");
        int real1 = kl.nextInt();
        //System.out.print("Enter the imaginary part of the first complex number: ");
        int imaginary1 = kl.nextInt();
        Complex num1 = new Complex(real1, imaginary1);
        
        //System.out.print("Enter the real part of the second complex number: ");
        int real2 = kl.nextInt();
        //System.out.print("Enter the imaginary part of the second complex number: ");
        int imaginary2 = kl.nextInt();
        Complex num2 = new Complex(real2, imaginary2);
        
        Complex result = num1.Mul_Complex(num1, num2);
        //System.out.print("The result of multiplication is: ");
        result.Display();
    }
}