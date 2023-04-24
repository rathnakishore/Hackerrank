@FunctionalInterface
interface StringValidator {
    boolean valid(String str, int n);
}

public class Main {
    public static void main(String[] args) {
        // Input values for str and n
        String str = "Hello";
        int n = 3;
        
        // Create a lambda expression to implement the valid method
        StringValidator validator = (s, num) -> {
            if (num < 1) {
                System.out.println("Invalid input");
                return false;
            } else {
                if (s.length() > num) {
                    System.out.println("Valid string");
                    return true;
                } else {
                    System.out.println("Invalid string");
                    return false;
                }
            }
        };
        
        // Call the valid method using the lambda expression
        validator.valid(str, n);
    }
}