import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class MedicineSorter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> medicines = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            String medicine = scanner.nextLine();
            medicines.add(medicine);
        }
        Collections.sort(medicines, (medicine1, medicine2) -> medicine1.compareToIgnoreCase(medicine2));
        
        for (String medicine : medicines) {
            System.out.println(medicine);
        }
    }
}