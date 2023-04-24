import java.util.Scanner;

enum Subject {
    Java("Shruti", 4),
    OS("Puneet Kumar", 3),
    AI("James William", 2),
    Android("Md. Adil Khan", 3);

    private final String faculty;
    private final int credits;

    private Subject(String faculty, int credits) {
        this.faculty = faculty;
        this.credits = credits;
    }

    public String getFaculty() {
        return faculty;
    }

    public int getCredits() {
        return credits;
    }
}

public class day15q1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String subjectName = scanner.nextLine();

        switch (subjectName) {
            case "Java":
                System.out.println(Subject.Java.getFaculty() + " " + Subject.Java.getCredits());
                break;
            case "OS":
                System.out.println(Subject.OS.getFaculty() + " " + Subject.OS.getCredits());
                break;
            case "AI":
                System.out.println(Subject.AI.getFaculty() + " " + Subject.AI.getCredits());
                break;
            case "Android":
                System.out.println(Subject.Android.getFaculty() + " " + Subject.Android.getCredits());
                break;
            default:
                System.out.println("This subject is not running in this semester.");
                break;
        }
    }
}