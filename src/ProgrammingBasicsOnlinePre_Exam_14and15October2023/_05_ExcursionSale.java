package ProgrammingBasicsOnlinePre_Exam_14and15October2023;

import java.util.Scanner;

public class _05_ExcursionSale {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int excursionsSea = Integer.parseInt(scanner.nextLine());
        int excursionsMountain = Integer.parseInt(scanner.nextLine());

        double profit = 0;

        String input = scanner.nextLine();

        while (!input.equals("Stop")) {
            String namePackage = input;

            switch (namePackage) {
                case "sea":
                    profit += 680;
                    excursionsSea--;

                    if (excursionsSea < 0) {
                        profit -= 680;
                    }

                    break;
                case "mountain":
                    profit += 499;
                    excursionsMountain--;

                    if (excursionsMountain < 0) {
                        profit -= 499;
                    }

                    break;


            }

            if (excursionsSea <= 0 && excursionsMountain <= 0) {
                System.out.println("Good job! Everything is sold.");
                break;
            }

            input = scanner.nextLine();
        }




        System.out.printf("Profit: %.0f leva.",profit);


    }
}


