package BookJava;

import java.util.Scanner;

public class _06_SquareofStars {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++ )
        {
            for (int j = 0 ; j < n; j++ )
            {
                if (i == 0 || i == n - 1 || j == 0 || j == n - 1)
                {
                    System.out.printf("*"+"");
                }
                else {
                    System.out.printf(" "+ "");
                }
            }
            System.out.println();

        }
    }
}



