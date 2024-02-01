package ConditionalStatementsExercise02;

import java.util.Scanner;

public class _07_Shopping {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        int videocards = Integer.parseInt(scanner.nextLine());
        int processors = Integer.parseInt(scanner.nextLine());
        int RAMmemory = Integer.parseInt(scanner.nextLine());


        double Pricevideocards = videocards * 250;
        double Priceprocessors = processors * (Pricevideocards * 0.35);
        double PriceRAMmemory = RAMmemory * (Pricevideocards * 0.10);
        double orderPrice = Pricevideocards + Priceprocessors + PriceRAMmemory;

        if (videocards > processors) {
            orderPrice = orderPrice - (orderPrice * 0.15);
        }

        if (orderPrice <= budget) {
            System.out.printf("You have %.2f leva left!", budget - orderPrice);
        } else {
            System.out.printf("Not enough money! You need %.2f leva more!", orderPrice - budget);
        }

    }

}




