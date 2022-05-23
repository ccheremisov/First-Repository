package Module1.integer;

import java.util.Scanner;

public class Exe13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите трехзначное число: ");
        int a = scanner.nextInt();
        int b = (a % 100 * 10) + (a / 100);
        System.out.println("Перенос первой цифры слева в конец числа равен: " + b);
    }
}
