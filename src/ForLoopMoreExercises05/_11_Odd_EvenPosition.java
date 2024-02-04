package ForLoopMoreExercises05;

import java.util.Scanner;

public class _11_Odd_EvenPosition {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        double oddSum = 0.0;
        double oddMin = 1000000000.0;
        double oddMax = -1000000000.0;
        double evenSum = 0.0;
        double evenMin = 1000000000.0;
        double evenMax = -1000000000.0;

        for (int i = 1; i <= n; i++) {
            double current = Double.parseDouble(scanner.nextLine());

            if (i % 2 == 0) {
                evenSum += current;
                if (current > evenMax) {
                    evenMax = current;
                }
                if (current < evenMin) {
                    evenMin = current;
                }

            } else {
                oddSum += current;
                if (current > oddMax) {
                    oddMax = current;
                }
                if (current < oddMin) {
                    oddMin = current;
                }
            }
        }
        System.out.printf("OddSum=%.2f,%n", oddSum);
        if (oddMin == 1000000000.0) {
            System.out.printf("OddMin=No,%n");
        } else {
            System.out.printf("OddMin=%.2f,%n", oddMin);
        }
        if (oddMax == -1000000000.0) {
            System.out.printf("OddMax=No,%n");
        } else {
            System.out.printf("OddMax=%.2f,%n", oddMax);
        }
        System.out.printf("EvenSum=%.2f,%n", evenSum);
        if (evenMin == 1000000000.0) {
            System.out.printf("EvenMin=No,%n");
        } else {
            System.out.printf("EvenMin=%.2f,%n", evenMin);
        }
        if (evenMax == -1000000000.0) {
            System.out.printf("EvenMax=No%n");
        } else {
            System.out.printf("EvenMax=%.2f%n", evenMax);
        }
    }
}






