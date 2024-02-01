package ConditionalStatementsMoreExercises02;

import java.util.Scanner;

public class _04_TransportPrice {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int kilometers = Integer.parseInt(scanner.nextLine());
        String travel = scanner.nextLine();

        double price = 0;
        String transport = "";


        if (travel.equals("day")) {
            price = 0.79;

        } else if (travel.equals("night")) {
            price = 0.90;
        }

        if (kilometers < 20) {
            price = 0.70 + (kilometers * price);

        } else if (kilometers < 100) {
            price = kilometers * 0.09;

        }else{
            price = kilometers * 0.06;
        }
        System.out.printf ("%.2f",price);

        }
   }

