package ProgrammingBasicsOnlineExam_6and7April2019;

import java.util.Scanner;

public class _03_OscarsWeekInCinema {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String filmName = scanner.nextLine();
        String hallView = scanner.nextLine();
        int ticketsNumber = Integer.parseInt(scanner.nextLine());

        double ticketPrice = 0.0;

        switch (filmName) {
            case "A Star Is Born":
                switch (hallView) {
                    case "normal":
                        ticketPrice = 7.50;
                        break;
                    case "luxury":
                        ticketPrice = 10.50;
                        break;
                    case "ultra luxury":
                        ticketPrice = 13.50;
                        break;
                }
                break;
            case "Bohemian Rhapsody":
                switch (hallView) {
                    case "normal":
                        ticketPrice = 7.35;
                        break;
                    case "luxury":
                        ticketPrice = 9.45;
                        break;
                    case "ultra luxury":
                        ticketPrice = 12.75;
                        break;
                }
                break;
            case "Green Book":
                switch (hallView) {
                    case "normal":
                        ticketPrice = 8.15;
                        break;
                    case "luxury":
                        ticketPrice = 10.25;
                        break;
                    case "ultra luxury":
                        ticketPrice = 13.25;
                        break;
                }
                break;
            case "The Favourite":
                switch (hallView) {
                    case "normal":
                        ticketPrice = 8.75;
                        break;
                    case "luxury":
                        ticketPrice = 11.55;
                        break;
                    case "ultra luxury":
                        ticketPrice = 13.95;
                        break;
                }
                break;
        }
                double totalSeats = ticketsNumber * ticketPrice;

                    System.out.printf("%s -> %.2f lv.", filmName , totalSeats);
                }
        }


