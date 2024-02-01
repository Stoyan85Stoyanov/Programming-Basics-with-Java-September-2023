package ConditionalStatementsExercise02;

import java.util.Scanner;

public class _05_GodzillavsKong {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        int actors = Integer.parseInt(scanner.nextLine());
        double pricePerCostume = Double.parseDouble(scanner.nextLine());


        double decor = budget * 0.10;
        double costumesPrice = actors * pricePerCostume;


        if (actors > 150) {
            costumesPrice = costumesPrice - (costumesPrice * 0.10);
        }


        double moviePrice = decor + costumesPrice;

        if (moviePrice <= budget) {
            System.out.println("Action!");
            System.out.printf("Wingard starts filming with %.2f leva left.", budget - moviePrice);
        } else {
            System.out.println("Not enough money!");
            System.out.printf("Wingard needs %.2f leva more.", moviePrice - budget);
        }
    }
}