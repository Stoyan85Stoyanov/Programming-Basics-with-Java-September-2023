package ForLoopMoreExercises05;

import java.util.Scanner;

public class _03_Logistics {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberofloads = Integer.parseInt(scanner.nextLine());
        int goods = 0;

        double pricebus = 0;
        double pricetruck = 0;
        double pricetrain = 0;
        double allgoods = 0;
        double totalpricebus = 0;
        double totalpricetruck = 0;
        double totalpricetrain = 0;
        double buscount = 0;
        double truckcount = 0;
        double traincount = 0;

        for (int i = 0; i < numberofloads; i++) {

            goods = Integer.parseInt(scanner.nextLine());

            if (goods <= 3) {

                pricebus = goods * 200;

                totalpricebus = totalpricebus + pricebus;
                buscount = buscount + goods;

            }

            if (goods >= 4 && goods <= 11) {

                pricetruck = goods * 175;

                totalpricetruck = totalpricetruck + pricetruck;
                truckcount = truckcount + goods;
            }

            if (goods >= 12) {

                pricetrain = goods * 120;

                totalpricetrain = totalpricetrain + pricetrain;
                traincount = traincount + goods;
            }

            allgoods = allgoods + goods;

        }

        double total = (totalpricebus + totalpricetruck + totalpricetrain) / allgoods;

            System.out.printf("%.2f%n" , total);
            System.out.printf("%.2f%%%n" , buscount / allgoods * 100);
            System.out.printf("%.2f%%%n" , truckcount / allgoods * 100);
            System.out.printf("%.2f%%" , traincount / allgoods * 100);

        }
    }

