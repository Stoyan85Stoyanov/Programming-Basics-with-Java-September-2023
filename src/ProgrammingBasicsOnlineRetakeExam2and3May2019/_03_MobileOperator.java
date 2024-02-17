package ProgrammingBasicsOnlineRetakeExam2and3May2019;

import java.util.Scanner;

public class _03_MobileOperator {

        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);

            String contractPeriod = scanner.nextLine();
            String contractType = scanner.nextLine();
            String isInternetIncluded = scanner.nextLine();
            int monthPeriod = Integer.parseInt(scanner.nextLine());

            double monthlyPrice = 0.00;

            if (contractPeriod.equals("one")) {
                switch (contractType) {
                    case "Small":
                        monthlyPrice = 9.98;
                        break;
                    case "Middle":
                        monthlyPrice = 18.99;
                        break;
                    case "Large":
                        monthlyPrice = 25.98;
                        break;
                    case "ExtraLarge":
                        monthlyPrice = 35.99;
                        break;
                }
            } else {
                switch (contractType) {
                    case "Small":
                        monthlyPrice = 8.58;
                        break;
                    case "Middle":
                        monthlyPrice = 17.09;
                        break;
                    case "Large":
                        monthlyPrice = 23.59;
                        break;
                    case "ExtraLarge":
                        monthlyPrice = 31.79;
                        break;
                }
            }

            if (isInternetIncluded.equals("yes")) {

                if (monthlyPrice <= 10.00) {
                    monthlyPrice = monthlyPrice + 5.50;
                } else if (monthlyPrice <= 30.00) {
                    monthlyPrice = monthlyPrice + 4.35;
                } else {
                    monthlyPrice = monthlyPrice + 3.85;
                }
            }

            double totalSum = monthlyPrice * monthPeriod;

            if (contractPeriod.equals("two")){
                totalSum = totalSum - (totalSum * (3.75 / 100.0));
            }

            System.out.printf("%.2f lv.", totalSum);
        }
    }


