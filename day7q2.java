import java.util.Scanner;

public class day7q2 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    
    int percentage = (b * 100) / a;
    System.out.println(percentage );
    
    if (percentage >= 75) {
      System.out.println("Yes");
    } else {
      System.out.println("No");
    }
  }
}