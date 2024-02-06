package Exam;

import java.util.Scanner;

public class _01_CatDiet {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int fats = Integer.parseInt(scanner.nextLine());
        int proteins = Integer.parseInt(scanner.nextLine());
        int carbohydrates = Integer.parseInt(scanner.nextLine());
        int caloriesTotal = Integer.parseInt(scanner.nextLine());
        int waterPercentage = Integer.parseInt(scanner.nextLine());

        int onegramfats = 9;
        int onegramproteins = 4;
        int onegramcarbohydrates = 4;

        double fatsgramsTotal = ((fats / 100.0) * caloriesTotal) / onegramfats;
        double proteinsTotal = ((proteins / 100.0) * caloriesTotal) / onegramproteins;
        double carbohydratesTotal = ((carbohydrates / 100.0) * caloriesTotal) / onegramcarbohydrates;

        double weightfood = fatsgramsTotal + proteinsTotal + carbohydratesTotal;
        double caloriespergramfood = caloriesTotal / weightfood;
        double onegram = caloriespergramfood * (1 - (waterPercentage / 100.0));

        System.out.printf("%.4f", onegram);

    }
}
