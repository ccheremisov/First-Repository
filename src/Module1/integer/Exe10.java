package Module1.integer;

import java.util.Scanner;

public class Exe10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите трехзначное число: ");
        int a = scanner.nextInt();
        int b = a % 10;
        int c = a / 10 % 10;
        System.out.println("Третья цифра данного числа равна: " + b);
        System.out.println("Вторая цифра данного числа равна: " + c);
    }
}
