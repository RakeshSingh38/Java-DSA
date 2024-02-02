import java.util.Scanner;

/**
 * This class represents a student grading system.
 * It allows the user to input student details, including name, roll number, and subject scores.
 * The overall grade is calculated based on the average score of the subjects.
 * The result is then displayed, including the student's name, roll number, subject-wise scores, and overall grade.
 * The user can choose to input details for another student or exit the program.
 */
public class StudentGradingSystem {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while (true) {
            // Input student details
            System.out.print("Enter student's name: ");
            String name = input.nextLine();

            System.out.print("Enter roll number: ");
            int rollNumber = input.nextInt();

            System.out.print("Enter the number of subjects: ");
            int numSubjects = input.nextInt();

            // Input subject scores
            int[] subjectScores = new int[numSubjects];
            for (int i = 0; i < numSubjects; i++) {
                System.out.print("Enter score for subject " + (i + 1) + ": ");
                subjectScores[i] = input.nextInt();
            }

            // Calculate overall grade
            char overallGrade = calculateOverallGrade(subjectScores);

            // Display result
            System.out.println("\nStudent Details:");
            System.out.println("Name: " + name);
            System.out.println("Roll Number: " + rollNumber);
            System.out.println("Subject-wise Scores:");
            for (int i = 0; i < numSubjects; i++) {
                System.out.println("Subject " + (i + 1) + ": " + subjectScores[i]);
            }
            System.out.println("Overall Grade: " + overallGrade);

            // Ask if the user wants to input details for another student
            System.out.print("\nDo you want to enter details for another student? (yes/no): ");
            String continueInput = input.next();

            if (!continueInput.equalsIgnoreCase("yes")) {
                break; // Exit the loop if the user does not want to continue
            }

            input.nextLine(); // Consume the newline character
        }

        input.close();
    }

    private static char calculateOverallGrade(int[] scores) {
        int totalScore = 0;
        for (int score : scores) {
            totalScore += score;
        }

        int averageScore = totalScore / scores.length;
        // imp      Calculating Overall grade according to the averageScore of students
        if (averageScore >= 90) {
            return 'A';
        } else if (averageScore >= 80) {
            return 'B';
        } else if (averageScore >= 70) {
            return 'C';
        } else if (averageScore >= 60) {
            return 'D';
        } else {
            return 'F';
        }
    }
}
