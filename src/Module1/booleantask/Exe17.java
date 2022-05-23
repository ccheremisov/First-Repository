package Module1.booleantask;

import java.util.Scanner;

public class Exe17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите целое число: ");
        int a = scanner.nextInt();
        if (a > 99 && a < 1000) {
            int b = a % 2;
            System.out.println("Данное число является нечетным трехзначным ?");
            boolean isOdd = b == 1;
            System.out.println(isOdd);
        }
        else {
            System.out.println("Ошибка");
        }
    }
}
