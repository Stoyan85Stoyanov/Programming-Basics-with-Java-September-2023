package ConditionalStatementsMoreExercises02;

import java.util.Scanner;

public class _06_FlowerShop {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int magnoliasNumber = Integer.parseInt(scanner.nextLine());
        int hyacinthsNumber = Integer.parseInt(scanner.nextLine());
        int rosesNumber = Integer.parseInt(scanner.nextLine());
        int cactiNumber = Integer.parseInt(scanner.nextLine());
        double giftprice = Double.parseDouble(scanner.nextLine());

        double magnolias = 3.25;
        double hyacinths = 4;
        double roses = 3.50;
        double cacti = 8;

        double price = magnoliasNumber * magnolias + hyacinthsNumber * hyacinths + rosesNumber * roses + cactiNumber * cacti;
        double taxes = price * 0.05;
        double profit = price - taxes;

        if (giftprice > profit) {
            double notreached = Math.ceil(giftprice - profit);
            System.out.printf("She will have to borrow %.0f leva.", notreached);

        } else  {
            double remain = Math.floor(profit - giftprice);
            System.out.printf("She is left with %.0f leva.", remain);
        }
    }
}
