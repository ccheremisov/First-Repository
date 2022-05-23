package Module1.integer;

import java.util.Scanner;

public class Exe9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите трехзначное число: ");
        int a = scanner.nextInt();
        int b = a / 100;
        System.out.println("Первая цифра данного числа равна: " + b);
    }
}
