package NestedLoopsMoreExercises07;

import java.util.Scanner;

public class _10_Profit {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int oneLevCoins = Integer.parseInt(scanner.nextLine());
        int twoLevCoins = Integer.parseInt(scanner.nextLine());
        int fiveLevCoins = Integer.parseInt(scanner.nextLine());
        int sum = Integer.parseInt(scanner.nextLine());

        for (int one = 0; one <= oneLevCoins; one++) {

            for (int two = 0; two <= twoLevCoins; two++) {

                for (int five = 0; five <= fiveLevCoins; five++) {

                    if (one + two * 2 + five * 5 == sum) {

                        System.out.printf("%d * 1 lv. + %d * 2 lv. + %d * 5 lv. = %d lv.%n", one, two, five, sum );

                    }
                }
            }
        }
    }
}


