package ForLoopMoreExercises05;

import java.util.Scanner;

public class _01_BackToThePast {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double inheritedmoney = Double.parseDouble(scanner.nextLine());
        int lastYear = Integer.parseInt(scanner.nextLine());
        int year = 0;
        int age = 17;

        for (year = 1800; year <= lastYear; year++) {

            if (year % 2 == 0) {
                age += 1;
                inheritedmoney -= 12000;
            } else {
                age += 1;
                inheritedmoney -= 12000 + (age * 50);
            }
        }
        if (inheritedmoney >= 0) {
            System.out.printf("Yes! He will live a carefree life and will have %.2f dollars left." , inheritedmoney);

        } else {

            double neededMoney = Math.abs(inheritedmoney);
            System.out.printf("He will need %.2f dollars to survive." , neededMoney);

        }
    }
}
