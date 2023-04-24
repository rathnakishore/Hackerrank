import java.util.Scanner;

class Student {
    private String name;
    private int registrationNo;
    
    public Student(String name, int registrationNo) {
        this.name = name;
        this.registrationNo = registrationNo;
    }
    
    public void show() {
        System.out.println(name + "," + registrationNo);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        
        if (choice == 1) {
            
            String name = scanner.next();
            
            int registrationNo = -1;
            while (registrationNo < 0) {
                
                registrationNo = scanner.nextInt();
            }
            
            Student student = new Student(name, registrationNo);
            student.show();
        } else if (choice == 2) {
            Student student = new Student(null, 0);
            student.show();
        } else {
            System.out.println("Wrong Choice");
        }
    }
}
