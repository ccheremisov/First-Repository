package Module1.integer;

import java.util.Scanner;

public class Exe7 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите двузначное число: ");
        int a = scanner.nextInt();
        int b = a / 10;
        int c = a % 10;
        int summa = b + c;
        int proizv = b * c;
        System.out.println("Сумма двух цифр равна: " + summa);
        System.out.println("Произведение двух цифр равно: " + proizv);
    }
}
