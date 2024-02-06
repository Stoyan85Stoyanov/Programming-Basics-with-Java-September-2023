package IZPITZADACHI;

import java.util.Scanner;

public class _01_PCStore {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double processor =Double.parseDouble(scanner.nextLine());
        double videocard =Double.parseDouble(scanner.nextLine());
        double memoryRam =Double.parseDouble(scanner.nextLine());
        int numbermemoryRam = Integer.parseInt(scanner.nextLine());
        double reduction = Double.parseDouble(scanner.nextLine());

        double dolar = 1.57;

        double processorBGPrice = processor * dolar;
        double videocardGBPrice = videocard * dolar;
        double memoryRamBGPrice = memoryRam * dolar;
        double memoryRamTotalprice = memoryRamBGPrice * numbermemoryRam;
        double processorafterreduction = processorBGPrice - (processorBGPrice * reduction);
        double videocardafterreduction = videocardGBPrice - (videocardGBPrice * reduction);
        double partsTotalprace = processorafterreduction + videocardafterreduction + memoryRamTotalprice;

        System.out.printf("Money needed -%.2f leva.", partsTotalprace);


    }
}
