package ConditionalStatementsAdvanced_MoreExercises03;

import java.util.Scanner;

public class _02_BikeRace {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int juniorcyclists = Integer.parseInt(scanner.nextLine());
        int seniorcyclists = Integer.parseInt(scanner.nextLine());
        String tracktype = scanner.nextLine();


        double price = 0;
        double totalparticipants = juniorcyclists + seniorcyclists;

        switch(tracktype){
            case "trail":
                price=juniorcyclists * 5.50 + seniorcyclists * 7;

                break;
            case "cross-country":

                if(totalparticipants>=50) {

                    price = (juniorcyclists * 8 + seniorcyclists * 9.50)*0.75;

                }else {
                    price = juniorcyclists * 8 + seniorcyclists * 9.50;
                }
                break;
            case "downhill":
                price = juniorcyclists * 12.25 + seniorcyclists * 13.75;

                break;

            case "road":
                price = juniorcyclists * 20 + seniorcyclists * 21.50;

                break;
        }
        System.out.printf("%.2f", price * 0.95);

        }
    }

