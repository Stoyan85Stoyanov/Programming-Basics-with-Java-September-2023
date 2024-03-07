package ProgrammingBasicsOnlineExam_6and7April2019;

import java.util.Scanner;

public class _01_Oscarsceremony {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int rentHall = Integer.parseInt(scanner.nextLine());

        double statuettesPrice = 0.00;
        double ketteringPrice = 0.00;
        double voiceoverPrice = 0.00;
        double totalPrice = 0.00;

        statuettesPrice = rentHall - (rentHall * 0.30);
        ketteringPrice = statuettesPrice - (statuettesPrice * 0.15);
        voiceoverPrice = ketteringPrice * 0.50;
        totalPrice = rentHall + statuettesPrice + ketteringPrice + voiceoverPrice;

        System.out.printf("%.2f" , totalPrice);

    }
}
