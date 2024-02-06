package IZPITZADACHI;

import java.util.Scanner;

public class _06_SumAndProduct {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        for (int a = 1; a <= 9 ; a++) {
            for (int b = 9; b >= a ; b--) {
                for (int c = 0; c <= 9 ; c++) {
                    for (int d = 9; d >=c ; d--) {

                        int amount = a + b + c + d;
                        int multiplication = a * b * c * d;

                        if ((amount == multiplication) && (n % 10 == 5)) {
                            System.out.printf("%d%d%d%d", a, b, c, d);
                            return;
                        } else if ((multiplication / amount == 3) && (n % 3 == 0)) {
                            System.out.printf("%d%d%d%d", d, c, b, a);
                            return;
                        }
                    }
                }
            }
        }

        System.out.println("Nothing found");
    }
}
