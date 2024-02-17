package ProgrammingBasicsOnlineRetakeExam2and3May2019;

import java.util.Scanner;

public class _01_FruitMarket {
        public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

            double strawberriesPrice = Double.parseDouble(scanner.nextLine());

            double bananasQuantity = Double.parseDouble(scanner.nextLine());

            double orangesQuantity = Double.parseDouble(scanner.nextLine());

            double raspberriesQuantity = Double.parseDouble(scanner.nextLine());

            double strawberriesQuantity = Double.parseDouble(scanner.nextLine());


            double raspberriesPrice = strawberriesPrice * 0.5;

            double orangesPrice = raspberriesPrice - ( 0.4 * raspberriesPrice);

            double bananasPrice = raspberriesPrice - (0.8 * raspberriesPrice );

            double raspberriesSym = raspberriesPrice * raspberriesQuantity ;

            double orangesSym = orangesPrice * orangesQuantity;

            double bananasSym = bananasPrice * bananasQuantity ;

            double strawberriesSym = strawberriesPrice * strawberriesQuantity;

            double totalSym = raspberriesSym + orangesSym + bananasSym + strawberriesSym;


            System.out.printf("%.2f", totalSym);


    }
}
