package NestedLoopsLab06;

import java.util.Scanner;

public class _04_SumOfTwoNumbers {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int startInterval = Integer.parseInt(scanner.nextLine());
        int endInterval = Integer.parseInt(scanner.nextLine());
        int magicNumber = Integer.parseInt(scanner.nextLine());

        int count = 0;

        boolean isFound = false;

        for (int i = startInterval; i <= endInterval; i++) {
            for (int j = startInterval; j <= endInterval; j++) {
                count++;
                int sum = i + j;
                if (sum == magicNumber) {
                    System.out.printf("Combination N:%d (%d + %d = %d)", count, i, j, sum);
                    isFound = true;
                    break;
                }
            }
            if (isFound) {
                break;
            }

        }
        if (!isFound) {
            System.out.printf("%d combinations - neither equals %d", count, magicNumber);

        }
    }
}
