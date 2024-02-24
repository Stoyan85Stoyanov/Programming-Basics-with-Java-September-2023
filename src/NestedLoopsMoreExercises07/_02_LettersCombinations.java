package NestedLoopsMoreExercises07;

import java.util.Scanner;

public class _02_LettersCombinations {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        char x1 = scanner.nextLine().charAt(0);
        char x2 = scanner.nextLine().charAt(0);
        char x3 = scanner.nextLine().charAt(0);
        int counter = 0;
        for (char i = x1; i <=x2 ; i++) {

            for (char j = x1; j <=x2 ; j++) {

                for (char k = x1; k <=x2 ; k++) {

                    if (i != x3 && j != x3 && k !=x3){

                        counter++;
                        sb.append(i);
                        sb.append(j);
                        sb.append(k);
                        sb.append(" ");
                    }
                }
            }
        }
        System.out.print(sb);
        System.out.print(counter);
    }
}
