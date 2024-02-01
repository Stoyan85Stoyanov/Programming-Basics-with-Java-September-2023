package ConditionalStatementsMoreExercises02;

import java.util.Scanner;

public class _02_SleepyTomCat {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int days = Integer.parseInt(scanner.nextLine());

        double rateplayTom = 30000;
        double work = 63;
        double rest = 127;

        double restminutesplay = days * rest;
        double workminutesplay = (365 - days) * work;
        double realTime = workminutesplay + restminutesplay;
        double difference = Math.abs(rateplayTom - realTime);
        double conversionhours = Math.floor(difference / 60);
        double conversionminutes = Math.floor(difference - (conversionhours * 60));

        if (rateplayTom >= realTime) {
            System.out.println("Tom sleeps well");
            System.out.printf("%.0f hours and %.0f minutes less for play", conversionhours, conversionminutes);

        }else {
            System.out.println("Tom will run away");
            System.out.printf("%.0f hours and %.0f minutes more for play", conversionhours, conversionminutes);
        }
    }
}
