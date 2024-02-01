package ConditionalStatementsMoreExercises02;

import java.util.Scanner;

public class _05_Pets {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int days = Integer.parseInt(scanner.nextLine());
        int foodleftbehind = Integer.parseInt(scanner.nextLine());
        double foodperdayforthedoginkilograms = Double.parseDouble(scanner.nextLine());
        double foodperdayforthecatinkilograms = Double.parseDouble(scanner.nextLine());
        double foodperdayfortheturtlekingrams = Double.parseDouble(scanner.nextLine());

        double necessaryfooddog = days * foodperdayforthedoginkilograms;
        double necessaryfoodcat = days * foodperdayforthecatinkilograms;
        double necessaryfoodturtle = (days * foodperdayfortheturtlekingrams) / 1000;
        double foodTotal = necessaryfooddog + necessaryfoodcat + necessaryfoodturtle;

        if (foodTotal <= foodleftbehind) {
            double leftoverfood = foodleftbehind - foodTotal;
            System.out.printf ("%.0f kilos of food left.",Math.floor(leftoverfood));

        }else{
            double leftoverfood = foodTotal - foodleftbehind;
            System.out.printf ("%.0f more kilos of food are needed.",Math.ceil(leftoverfood));
        }
    }
}
