package WhileLoopLab05;

import java.util.Scanner;

public class _06_MaxNumber {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int maxNumber = Integer.MIN_VALUE;

        String text = scanner.nextLine();

        while (!text.equals("Stop")){

            int number = Integer.parseInt(text);

            if (number > maxNumber ) {
                maxNumber = number;
            }
            text = scanner.nextLine();
        }
        System.out.println(maxNumber);
    }
}
