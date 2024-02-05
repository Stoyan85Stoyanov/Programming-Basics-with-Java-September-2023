package NestedLoopsExercise06;

import java.util.Scanner;

public class _03_SumPrimeNonPrime {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // ---- 1. Дефиниране на двете суми = прости и непрости числа
        // ---- 2. Пускаме while цикъл докато не получим команда "stop"
        // ---- 3. За всяко прочетено число:
        //      - Проверяваме дали числото е отрицателно
        //      - Проверяваме дали числото е просто или непросто
        //      - Добавяме числото към съответната сума
        // ---- 4. Принтираме двете суми

        int primeSum = 0;
        int nonPrimeSum = 0;

        String input = scanner.nextLine();
        while (!input.equals("stop")) {

            int number = Integer.parseInt(input);

            if (number < 0) {
                System.out.println("Number is negative.");
            } else {

                boolean isPrime = true;

                // [2, n-1]
                // isPrime = false;
                for (int divisor = 2; divisor <= number - 1; divisor++) {

                    // Има друг възможен делител!
                    if (number % divisor == 0) {
                        isPrime = false;
                        break;
                    }
                }

                if (isPrime) {
                    primeSum += number;
                } else {
                    nonPrimeSum += number;
                }
            }

            input = scanner.nextLine();
        }

        System.out.printf("Sum of all prime numbers is: %d\n", primeSum);
        System.out.printf("Sum of all non prime numbers is: %d\n", nonPrimeSum);

    }
}
