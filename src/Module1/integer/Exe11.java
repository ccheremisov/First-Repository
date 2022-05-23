package Module1.integer;

import java.util.Scanner;

public class Exe11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите трехзначное число: ");
        int a = scanner.nextInt();
        int b = a / 100;
        int c = a / 10 % 10;
        int d = a % 10;
        int summa = b + c + d;
        int proizv = b * c * d;
        System.out.println("Сумма трех цифр равна: " + summa);
        System.out.println("Произведение трех цифр равно: " + proizv);
    }
}
