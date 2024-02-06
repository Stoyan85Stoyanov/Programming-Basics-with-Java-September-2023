package IZPITZADACHI;

import java.util.Scanner;

public class _02_DeerOfSanta {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int daysNumber = Integer.parseInt(scanner.nextLine());
        int food = Integer.parseInt(scanner.nextLine());
        double foodfirstdeer = Double.parseDouble(scanner.nextLine());
        double foodseconddeer = Double.parseDouble(scanner.nextLine());
        double foodthirddeer = Double.parseDouble(scanner.nextLine());

        double necessaryfoodfirstdeer = daysNumber * foodfirstdeer;
        double necessaryfoodseconddeer = daysNumber * foodseconddeer;
        double necessaryfoodthirddeer = daysNumber * foodthirddeer;
        double neededfoodTotal = necessaryfoodfirstdeer + necessaryfoodseconddeer + necessaryfoodthirddeer;

        if (neededfoodTotal < food ) {
            double remainsfood = Math.floor(food - neededfoodTotal);
            System.out.printf("%.0f kilos of food left.", remainsfood);
        }else {
            double reachfood = Math.ceil( neededfoodTotal - food);
            System.out.printf("%.0f more kilos of food are needed.", reachfood);
        }
    }
}

