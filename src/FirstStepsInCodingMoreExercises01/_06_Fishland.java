package FirstStepsInCodingMoreExercises01;

import java.util.Scanner;

public class _06_Fishland {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double themackerel = Double.parseDouble(scanner.nextLine());
        double thesprat = Double.parseDouble(scanner.nextLine());
        double bonito = Double.parseDouble(scanner.nextLine());
        double safrid = Double.parseDouble(scanner.nextLine());
        int mussels = Integer.parseInt(scanner.nextLine());

        double Pricebonito =  themackerel + themackerel * 0.60;
        double Sumbonito =  Pricebonito * bonito;
        double Pricesafrid = thesprat + thesprat * 0.80;
        double Sumsafrid = Pricesafrid * safrid;
        double Pricemussels = mussels * 7.50;

        double Totalprice = Sumbonito + Sumsafrid + Pricemussels;

        System.out.printf("%.2f" , Totalprice);

    }
}
