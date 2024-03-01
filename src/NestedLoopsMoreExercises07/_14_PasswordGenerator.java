package NestedLoopsMoreExercises07;

import java.util.Scanner;

public class _14_PasswordGenerator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n1 = Integer.parseInt(scanner.nextLine());
        int n2 = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i < n1; i++) {

            for (int j = 1; j < n1; j++) {

                for (char k = 'a'; k < 'a' + n2; k++) {

                    for (char l = 'a'; l < 'a' + n2; l++) {

                        for (int m = 1; m <= n1; m++) {

                            if ((m > i) && (m > j)) {

                                System.out.printf("%d%d%s%s%d" + " ", i,j,k,l,m);
                            }
                        }
                    }
                }
            }
        }
    }
}


