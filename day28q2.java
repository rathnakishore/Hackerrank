import java.io.*;
import java.util.*;

public class day {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n1 = scanner.nextInt(); // read the size of the first array

        int[] a1 = new int[n1]; // create the first array

        for (int i = 0; i < n1; i++) {

            a1[i] = scanner.nextInt(); // read the elements of the first array

        }

        int n2 = scanner.nextInt(); // read the size of the second array

        int[] a2 = new int[n2]; // create the second array

        for (int i = 0; i < n2; i++) {

            a2[i] = scanner.nextInt(); // read the elements of the second array

        }

        int n3 = scanner.nextInt(); // read the size of the third array

        int[] a3 = new int[n3]; // create the third array

        for (int i = 0; i < n3; i++) {

            a3[i] = scanner.nextInt(); // read the elements of the third array

        }

        // call the findCommonElements method to find the common elements

        List<Integer> commonElements = findCommonElements(a1, a2, a3);

        // sort the common elements in ascending order

        Collections.sort(commonElements);

        // print the common elements separated by space

        for (int element : commonElements) {

            System.out.print(element + " ");

        }

    }

    

    // helper method to find the common elements in three arrays

    public static List<Integer> findCommonElements(int[] a1, int[] a2, int[] a3) {

        List<Integer> commonElements = new ArrayList<>();

        // create sets from the arrays to remove duplicates

        Set<Integer> set1 = new HashSet<>();

        for (int element : a1) {

            set1.add(element);

        }

        Set<Integer> set2 = new HashSet<>();

        for (int element : a2) {

            set2.add(element);

        }

        Set<Integer> set3 = new HashSet<>();

        for (int element : a3) {

            set3.add(element);

        }

        // iterate over the elements in the first set

        for (int element : set1) {

            // if the element is present in the other two sets, add it to the commonElements list

            if (set2.contains(element) && set3.contains(element)) {

                commonElements.add(element);

            }

        }

        return commonElements;

    }

}