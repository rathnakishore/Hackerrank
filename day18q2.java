import java.util.Scanner;

public class day18q2 {
    enum Day {
        MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        String input = scanner.nextLine();

        Day day = null;
        try {
            day = Day.valueOf(input.toUpperCase());
        } catch (IllegalArgumentException e) {
            System.out.println("Library is closed \uD83D\uDE1E");
            return;
        }

        switch (day) {
            case MONDAY:
            case TUESDAY:
            case WEDNESDAY:
            case THURSDAY:
            case FRIDAY:
                System.out.println("8:30 5:30");
                break;
            case SATURDAY:
                System.out.println("9:30 4:30");
                break;
            default:
                System.out.println("Library is closed \uD83D\uDE1E");
                break;
        }
    }
}