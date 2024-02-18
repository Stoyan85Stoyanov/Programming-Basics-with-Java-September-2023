package ProgrammingBasicsOnlineRetakeExam2and3May2019;

import java.util.Scanner;

public class _05_DivisionWithoutRemainder {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        double p1 = 0.00;
        double p2 = 0.00;
        double p3 = 0.00;

                
        for (int i = 0; i < n; i++) {
            int  number = Integer.parseInt(scanner.nextLine());


            if (number % 2 == 0){

               p1++;
             }
            if (number % 3 == 0){

                p2++;
            }
            if (number % 4 == 0) {

                p3++;
            }
        }



            System.out.printf("%.02f%%\n", p1 / n * 100);
            System.out.printf("%.02f%%\n", p2 / n * 100);
            System.out.printf("%.02f%%\n", p3 / n * 100);

        }
    }


