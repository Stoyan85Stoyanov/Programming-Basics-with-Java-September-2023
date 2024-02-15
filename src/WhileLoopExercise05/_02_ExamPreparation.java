package WhileLoopExercise05;

import java.util.Scanner;

public class _02_ExamPreparation {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int failedTaskAvailability = Integer.parseInt(scanner.nextLine());

        int failedTasks = 0;
        int totalTasks = 0;
        double totalGrades = 0.00;
        String lastProblem = "";


        String taskName = scanner.nextLine();


        while (!taskName.equals("Enough")) {

            int assessment = Integer.parseInt(scanner.nextLine());
            totalTasks++;
            totalGrades += assessment;

            if (assessment <= 4) {
                failedTasks++;
                if (failedTasks == failedTaskAvailability) {
                    System.out.printf("You need a break, %d poor grades.", failedTasks);
                    return;
                }
            }

            lastProblem = taskName;


            taskName = scanner.nextLine();
        }

        System.out.printf("Average score: %.2f\n", totalGrades / totalTasks);
        System.out.printf("Number of problems: %d\n", totalTasks);
        System.out.printf("Last problem: %s\n", lastProblem);
    }
}
