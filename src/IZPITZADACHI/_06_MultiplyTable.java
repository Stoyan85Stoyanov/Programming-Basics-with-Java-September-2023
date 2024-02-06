package IZPITZADACHI;

import java.util.Scanner;

public class _06_MultiplyTable {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());

        // calculations -> 324
        int number1 = number % 10; // единици -> 4
        int number2 = (number / 10) % 10; // десетици -> 2
        int number3 = (number / 10 / 10) % 10; // стотици -> 3

        // output data
        for (int i = 1; i <= number1; i++) {
            for (int j = 1; j <= number2; j++) {
                for (int k = 1; k <= number3; k++) {
                    System.out.printf("%d * %d * %d = %d;%n", i, j, k, i * j * k);
                }
            }
        }
    }
}
