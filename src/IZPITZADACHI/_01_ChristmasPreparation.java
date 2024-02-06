package IZPITZADACHI;

import java.util.Scanner;

public class _01_ChristmasPreparation {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int wrappingpaper = Integer.parseInt(scanner.nextLine());
        int rollsoffabric = Integer.parseInt(scanner.nextLine());
        double litersglue =Double.parseDouble(scanner.nextLine());
        int reduction = Integer.parseInt(scanner.nextLine());

        double paper = 5.80;
        double cloth = 7.20;
        double glue = 1.20;

        double wrappingpaperPrice = wrappingpaper * paper;
        double rollsoffabricPrice = rollsoffabric * cloth;
        double gluePrice = litersglue * glue;
        double materialsPrice = wrappingpaperPrice + rollsoffabricPrice + gluePrice;
        double reductionPrice = materialsPrice - (materialsPrice *(reduction /100.0));

        System.out.printf("%.3f", reductionPrice);



    }
}
