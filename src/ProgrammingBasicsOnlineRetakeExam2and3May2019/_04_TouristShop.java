package ProgrammingBasicsOnlineRetakeExam2and3May2019;

import java.util.Scanner;

public class _04_TouristShop {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        String productName = scanner.nextLine();
        double productPrice = Double.parseDouble(scanner.nextLine());
        double totalPrice = Double.parseDouble(scanner.nextLine());



        //Бюджета е 153.20 лв.
        //Купуваме раница за 25.20 лева. Остават 128 лв.
        //Купуваме обувки за 54 лева. Остават 74 лв.
        //Купуваме слънчеви очила за 30 лева, но тъй като за всеки трети продукт има отстъпка и цената му е наполовина, така че цената на очилата става 30 / 2 = 15 лева. Остават 59 лв.
        //Получаваме командата "Stop", купили сме 3 продукта на обща стойност 25.20 + 54 + 15 = 94.20 лв.
    }
}
