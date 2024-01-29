package FirstStepsInCodingExercise01;

import java.util.Scanner;

public class _05_SuppliesForSchool {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int countPens = Integer.parseInt(scanner.nextLine());
        int countMarkers = Integer.parseInt(scanner.nextLine());
        int litersPrep = Integer.parseInt(scanner.nextLine());
        int percentDiscount = Integer.parseInt(scanner.nextLine());

        double pricePens = countPens * 5.80;
        double priceMarkers = countMarkers * 7.20;
        double pricePrep = litersPrep * 1.20;
        double totalPrice = pricePens + priceMarkers + pricePrep;

        double finalPrice = totalPrice - (totalPrice * (percentDiscount / 100.0));

        System.out.println(finalPrice);

    }
}
