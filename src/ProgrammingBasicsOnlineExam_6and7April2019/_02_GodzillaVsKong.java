package ProgrammingBasicsOnlineExam_6and7April2019;

import java.util.Scanner;

public class _02_GodzillaVsKong {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double filmBudget = Double.parseDouble(scanner.nextLine());
        int extrasNumber = Integer.parseInt(scanner.nextLine());
        double clothingPrice = Double.parseDouble(scanner.nextLine());

        double decorAmount = 0.00;
        double clothingAmount = 0.00;
        double filmPrice = 0.00;
        double remain = 0.00;

        decorAmount = filmBudget * 0.10;
        clothingAmount = extrasNumber * clothingPrice;

        if (extrasNumber > 150) {
            clothingAmount = clothingAmount - (clothingAmount * 0.10);
        }

        filmPrice = decorAmount + clothingAmount;
        remain = filmBudget - filmPrice;


        if (filmPrice > filmBudget) {
            System.out.printf("Not enough money!%n");
            System.out.printf("Wingard needs %.2f leva more." , Math.abs(remain));

        }else if (filmPrice <= filmBudget) {
            System.out.printf("Action!%n");
            System.out.printf("Wingard starts filming with %.2f leva left." , remain);

        }
    }
}
