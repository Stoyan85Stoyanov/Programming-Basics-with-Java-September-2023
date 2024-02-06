package Exam;

import java.util.Scanner;

public class _05_Everest {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String yesOrno = scanner.nextLine();

        int startHeight = 5364;
        int target = 8848;
        int curentHeight = 0;
        int count = 1;

        while (!yesOrno.equals("END")) {

            if (yesOrno.equals("Yes")) {
                count++;
            }

            int height = Integer.parseInt(scanner.nextLine());
            curentHeight += height;

            if (curentHeight + startHeight >= target) {
                break;
            }

            if (count == 5) {
                break;
            }

            yesOrno = scanner.nextLine();
        }

        if (startHeight + curentHeight < target) {
            System.out.println("Failed!");
            System.out.printf("%d", startHeight + curentHeight);
        } else {
            System.out.printf("Goal reached for %d days!", count);
        }
    }
}
