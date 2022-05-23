package Module1.booleantask;

import java.util.Scanner;

public class Exe15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите целое число: ");
        int a = scanner.nextInt();
        System.out.println("Введите целое число: ");
        int b = scanner.nextInt();
        System.out.println("Введите целое число: ");
        int c = scanner.nextInt();
        System.out.println("Ровно два из чисел A, B, C являются положительными ?");
        boolean isOdd = a > 0 && b > 0 && c <= 0 || a <= 0 && b > 0 && c > 0 || a > 0 && b <= 0 && c > 0;
        System.out.println(isOdd);
    }
}
