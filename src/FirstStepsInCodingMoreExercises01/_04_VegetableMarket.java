package FirstStepsInCodingMoreExercises01;

import java.util.Scanner;

public class _04_VegetableMarket {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double Pricevegetables = Double.parseDouble(scanner.nextLine());
        double Pricefruits = Double.parseDouble(scanner.nextLine());
        int sumvegetables = Integer.parseInt(scanner.nextLine());
        int sumfruits = Integer.parseInt(scanner.nextLine());

        double orderPrice = (Pricevegetables * sumvegetables)  + (Pricefruits * sumfruits);
        double SymorderPrice = ( orderPrice / 1.94);

            System.out.printf("%.2f" , SymorderPrice);

        }

    }


