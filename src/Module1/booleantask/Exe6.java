package Module1.booleantask;

import java.util.Scanner;

public class Exe6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите целое число: ");
        int a = scanner.nextInt();
        System.out.println("Введите целое число: ");
        int b = scanner.nextInt();
        System.out.println("Введите целое число: ");
        int c = scanner.nextInt();
        System.out.println("Справедливо двойное неравенство A < B < C ?");
        boolean isRight = a < b && b < c;
        System.out.println(isRight);
    }
}
