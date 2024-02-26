package NestedLoopsMoreExercises07;

import java.util.Scanner;

public class _08_SecretDoorsLock {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n100 = Integer.parseInt(scanner.nextLine());
        int n10 = Integer.parseInt(scanner.nextLine());
        int n1 = Integer.parseInt(scanner.nextLine());


        for (int i = 2; i <= n100; i++) {

            if (i % 2 == 0) {

                for (int j = 2; j <= n10; j++) {

                    if (j == 2 || j == 3 || j == 5 || j == 7) {

                        for (int k = 2; k <= n1; k++) {

                            if (k % 2 == 0) {

                                System.out.printf("%d %d %d%n", i, j, k);

                            }
                        }
                    }
                }
            }
        }
    }
}


