package Module1.booleantask;

import java.util.Scanner;

public class Exe18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите целое число: ");
        int a = scanner.nextInt();
        System.out.println("Введите целое число: ");
        int b = scanner.nextInt();
        System.out.println("Введите целое число: ");
        int c = scanner.nextInt();
        System.out.println("Среди трех данных целых чисел есть хотя бы одна пара совпадающих ?");
        boolean isOdd = a == b || b == c || a == c;
        System.out.println(isOdd);
    }
}
