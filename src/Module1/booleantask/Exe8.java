package Module1.booleantask;

import java.util.Scanner;

public class Exe8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите целое число: ");
        int a = scanner.nextInt();
        System.out.println("Введите целое число: ");
        int b = scanner.nextInt();
        System.out.println("Каждое из чисел A и B нечетное ?");
        int c = a % 2;
        int d = b % 2;
        boolean isOdd = c == 1 && d == 1;
        System.out.println(isOdd);
    }
}
