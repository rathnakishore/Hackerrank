import java.util.Scanner;

public class day19q1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the number of subjects
        
        int numSubjects = scanner.nextInt();

        // Read the CA marks for each subject
        double[][] marks = new double[numSubjects][];
        for (int i = 0; i < numSubjects; i++) {
            
            int numCAs = scanner.nextInt();

            marks[i] = new double[numCAs];
            for (int j = 0; j < numCAs; j++) {
                
                marks[i][j] = scanner.nextDouble();
            }
        }

        // Read the subject number for which average marks should be displayed
        
        int subjectNum = scanner.nextInt();

        // Calculate and display the average marks for the selected subject
        double sum = 0;
        for (double mark : marks[subjectNum - 1]) {
            sum += mark;
        }
        double avg = sum / marks[subjectNum - 1].length;

        System.out.println("Average in Subject-" + subjectNum + " is " + avg);
    }
}