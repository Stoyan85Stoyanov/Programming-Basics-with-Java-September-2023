package ConditionalStatementsLab02;

import java.util.Scanner;

public class _01_ExcellentResult {

    public static void main(String[] args) {

        Scanner scaner = new Scanner(System.in);

        int grade = Integer.parseInt(scaner.nextLine());

        if (grade >= 5) {

            System.out.println("Excellent!");
        }

    }
}
