package Module1.ifAndElse;

import java.util.Scanner;

public class Exe5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите целое число: ");
        int a = scanner.nextInt();
        System.out.println("Введите целое число: ");
        int b = scanner.nextInt();
        System.out.println("Введите целое число: ");
        int c = scanner.nextInt();
        int poss = 0;
        int negative = 0;
        if (a >= 0) {
            poss ++;
        } else negative ++;
        if (b >= 0) {
            poss ++;
        } else negative ++;
        if (c >= 0) {
            poss ++;
        } else negative ++;
        System.out.println("Положительных чисел: " + poss);
        System.out.println("Отрицательных чисел: " + negative);
    }
}
