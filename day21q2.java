import java.util.Scanner;

class Circle {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return 3.14 * radius * radius;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        int n = scanner.nextInt();

        
        Circle[] circles = new Circle[n];

        
        for (int i = 0; i < n; i++) {
            double radius = scanner.nextDouble();

            
            if (radius < 0.0) {
                radius = 0.0;
            }

        
            circles[i] = new Circle(radius);
        }

    
        for (int i = 0; i < n; i++) {
            double area = circles[i].getArea();

            if (area > 30.0) {
                System.out.print(String.format("%.4f", area) + " ");
            }
        }
    }
}