import java.util.*;

public class Main {
    public static double[] average_marks(double[][] marks) {

    double[] averages = new double[marks.length];

    for (int i = 0; i < marks.length; i++) {

        Arrays.sort(marks[i]); // sort the marks of the i-th student in ascending order

        double sum = marks[i][marks[i].length-1] + marks[i][marks[i].length-2]; // add the two highest marks

        averages[i] = sum / 2.0; // compute the average of the two highest marks

    }

    return averages;

}

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt(); // read the number of students

        double[][] marks = new double[n][3]; // create a 2-D array to store the marks

        for (int i = 0; i < n; i++) {

            for (int j = 0; j < 3; j++) {

                marks[i][j] = scanner.nextDouble(); // read the marks of the i-th student

            }

        }

        double[] averages = average_marks(marks); // compute the averages of the best 2 tasks

        for (int i = 0; i < n; i++) {

            System.out.print(averages[i] + " "); // print the averages separated by space

        }

    }

}