package Module1.integer;

import java.util.Scanner;

public class Exe6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите двузначное число: ");
        int a = scanner.nextInt();
        int c = a % 10;
        int b = a / 10;
        System.out.println("Левая сторона числа равна: " + b);
        System.out.println("Правая сторона числа равна: " + c);
    }
}
