package ProgrammingBasicsOnlineExam_6and7April2019;

import java.util.Scanner;

public class _06_CinemaTickets {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int students = 0;
        int standard = 0;
        int kids = 0;

        String filmName = scanner.nextLine();

        while (!"Finish".equals(filmName)) {

            int places = Integer.parseInt(scanner.nextLine());
            int people = 0;

            for (int i = 0; i < places; i++) {

                String command = scanner.nextLine();

                if ("student".equals(command)) {
                    students++;

                } else if ("standard".equals(command)) {
                    standard++;

                } else if ("kid".equals(command)) {
                    kids++;

                } else if ("End".equals(command)) {
                    break;
                }
                people++;
            }

            System.out.printf("%s - %.2f%% full.%n", filmName, people * 1.0 / places * 100);
            filmName = scanner.nextLine();

        }

        int totalTickets = standard + students + kids;

        System.out.printf("Total tickets: %d%n", totalTickets);
        System.out.printf("%.2f%% student tickets.%n", (students * 1.0 / totalTickets * 100));
        System.out.printf("%.2f%% standard tickets.%n", (standard * 1.0 / totalTickets * 100));
        System.out.printf("%.2f%% kids tickets.%n", (kids * 1.0 / totalTickets * 100));

        }
    }

