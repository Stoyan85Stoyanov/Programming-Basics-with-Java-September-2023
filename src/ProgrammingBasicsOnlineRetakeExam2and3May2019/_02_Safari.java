package ProgrammingBasicsOnlineRetakeExam2and3May2019;

import java.util.Scanner;

public class _02_Safari {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        double budget = Double.parseDouble(scanner.nextLine());
        double litersfuel = Double.parseDouble(scanner.nextLine());
        String dayweek = scanner.nextLine();

        double fuelprice = litersfuel * 2.10;
        double totalPrice = fuelprice + 100;


        switch (dayweek) {
            case ("Saturday"):
                totalPrice = totalPrice * 0.9;
                break;

            case ("Sunday"):
                totalPrice = totalPrice * 0.8;
                break;
        }

        //double difference = Math.abs(budget-totalPrice);

        if (totalPrice <= budget) {
            System.out.printf("Safari time! Money left: %.2f lv.", budget-totalPrice);
        } else {
            System.out.printf("Not enough money! Money needed: %.2f lv.", totalPrice-budget);
        }

    }
}




