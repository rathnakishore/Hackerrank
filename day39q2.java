import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;

public class StringFilter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if (n <= 1) {
            System.out.println("Invalid");
            return;
        }
        List<String> strings = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            strings.add(scanner.next());
        }
        Predicate<String> endsWithG = s -> s.endsWith("g");
        List<String> filteredStrings = filterStrings(strings, endsWithG);
        for (String s : filteredStrings) {
            System.out.println(s);
        }
    }

    public static List<String> filterStrings(List<String> strings, Predicate<String> predicate) {
        List<String> filteredStrings = new ArrayList<>();
        for (String s : strings) {
            if (predicate.test(s)) {
                filteredStrings.add(s);
            }
        }
        return filteredStrings;
    }
}