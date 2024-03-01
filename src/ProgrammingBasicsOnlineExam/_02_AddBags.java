package ProgrammingBasicsOnlineExam;

import java.util.Scanner;

public class _02_AddBags {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        double priceBaggage = Double.parseDouble(scanner.nextLine());
        double baggageKg = Double.parseDouble(scanner.nextLine());
        int journeyDays = Integer.parseInt(scanner.nextLine());
        int baggageNumber = Integer.parseInt(scanner.nextLine());

        double price = 0;
        double totalPrice = 0;


        if (baggageKg < 10) {
            price = priceBaggage * 0.2;
        } else if (baggageKg <= 20) {
            price = priceBaggage * 0.5;
        } else {
            price = priceBaggage;
        }

        if (journeyDays > 30) {
            price = price + (price * 0.1);
        } else if (journeyDays >= 7 && journeyDays <= 30) {
            price = price + (price * 0.15);
        } else if (journeyDays < 7 ){
            price = price + (price * 0.4);
        }

         totalPrice = baggageNumber * price;


        System.out.printf("The total price of bags is: %.2f lv.%n ", totalPrice);

    }
}

