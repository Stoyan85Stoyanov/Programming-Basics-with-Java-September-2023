package WhileLoopMoreExercises04;

import java.util.Scanner;

public class _05_AverageNumber {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        double totalsum = 0;

        for (int i = 0; i < n; i++) {
            int number = Integer.parseInt(scanner.nextLine());
            totalsum+=number;

        }
        System.out.printf("%.2f", totalsum/n);
    }
}
