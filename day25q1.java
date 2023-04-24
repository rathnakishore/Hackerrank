import java.util.*;

public class PrimeFactors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        findPrimeFactors(num);
    }
    
    public static void findPrimeFactors(int num) {
        if (num < 10 || num > 50) {
            System.out.println("Invalid");
            return;
        }
        
        List<Integer> factors = new ArrayList<>();
        
        while (num % 2 == 0) {
            factors.add(2);
            num /= 2;
        }
        for (int i = 3; i <= Math.sqrt(num); i += 2) {
            while (num % i == 0) {
                factors.add(i);
                num /= i;
            }
        }
        
        if (num > 2) {
            factors.add(num);
        }
        Collections.sort(factors);
        for (int factor : factors) {
            System.out.print(factor + " ");
        }
    }
}