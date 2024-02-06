package WhileLoopMoreExercises04;

import java.util.Scanner;

public class _03_StreamOfLetters {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String textName = "";

        int c = 0;
        int n = 0;
        int o = 0;

        String line = scanner.nextLine();
        while (!"End".equals(line)) {

            char input = line.charAt(0);
            if ((input >= 'a' && input <= 'z') ||(input >= 'A' && input <= 'Z')) {

                if (input == ('c')) {
                    if (c == 0) {
                        c += 1;
                    } else {
                        textName += input;
                    }
                } else if (input == ('n')) {
                    if (n == 0) {
                        n += 1;
                    } else {
                        textName += input;
                    }
                } else if (input == ('o')) {
                    if (o == 0) {
                        o += 1;
                    } else {
                        textName += input;
                    }
                } else {
                    textName += input;
                }

                if (c==1 && n==1 && o==1) {
                    textName += " ";
                    System.out.print(textName);

                    textName = "";
                     c = 0;
                     n = 0;
                     o = 0;
                }
            }
            line = scanner.nextLine();
        }
    }
}