package ProgrammingBasicsOnlineExam;

import java.util.Scanner;

public class _01_AgencyProfit {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        String airline = scanner.nextLine();
        int adultTickets = Integer.parseInt(scanner.nextLine());
        int childTickets = Integer.parseInt(scanner.nextLine());
        double adultTicketPrice = Double.parseDouble(scanner.nextLine());
        double additionalFee = Double.parseDouble(scanner.nextLine());


        double childTicketPrice = adultTicketPrice * 0.3;


        adultTicketPrice = adultTicketPrice + additionalFee;
        childTicketPrice = childTicketPrice + additionalFee;


        double totalProfit = (adultTickets * adultTicketPrice) + (childTickets * childTicketPrice);


        double agencyProfit = totalProfit * 0.2;


        System.out.printf("The profit of your agency from %s tickets is %.2f lv.%n", airline, agencyProfit);

        //Programming Basics Online Exam - 18 and 19 July 2020
    }
}

