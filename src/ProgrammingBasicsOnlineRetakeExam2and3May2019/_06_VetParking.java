package ProgrammingBasicsOnlineRetakeExam2and3May2019;

import java.util.Scanner;

public class _06_VetParking {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int days = Integer.parseInt(scanner.nextLine());
        int hours = Integer.parseInt(scanner.nextLine());

        double pricedays = 0;
        double pricehours = 0;
        double pricedaysandhours = 0;


        if (days / 2 == 0)  {
            pricedays =  2.50;

        } if ( hours / 2 != 0) {
            pricehours =  2.50;

        } if (days / 2 != 0) {
            pricedays =  1.25;

        } if (hours / 2 == 0) {
            pricehours =  1.25;

        } else {
            pricedaysandhours = 1.00;
        }

        double totalSum = pricedays  + pricehours  + pricedaysandhours ;

        System.out.printf("%.2f lv.", totalSum);

    }
}

