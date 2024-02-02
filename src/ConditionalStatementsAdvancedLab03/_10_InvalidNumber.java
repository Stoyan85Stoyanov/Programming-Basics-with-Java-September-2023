package ConditionalStatementsAdvancedLab03;

import java.util.Scanner;

public class _10_InvalidNumber {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());

        boolean validNumber = num >= 100 && num <= 200 || num == 0;

        if (!validNumber) {
            System.out.println("invalid");
        }

    }

}