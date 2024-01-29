package FirstStepsInCodingExercise01;

import java.util.Scanner;

public class _08_BasketballEquipment {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double annualFee = Double.parseDouble(scanner.nextLine());

        double sneakersPrice = annualFee - (annualFee * (40 / 100.0));
        double suitPrice = sneakersPrice - (sneakersPrice * (20 / 100.0));
        double ballPrice = suitPrice / 4;
        double accessoriesPrice = ballPrice / 5;

        double totalSum = annualFee + sneakersPrice + suitPrice + ballPrice + accessoriesPrice;

        System.out.println(totalSum);

    }
}
