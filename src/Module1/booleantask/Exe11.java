package Module1.booleantask;

import java.util.Scanner;

public class Exe11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите целое число: ");
        int a = scanner.nextInt();
        System.out.println("Введите целое число: ");
        int b = scanner.nextInt();
        System.out.println("Числа A и B имеют одинаковую четность ?");
        int c = a % 2;
        int d = b % 2;
        boolean isOdd = (c == 0 && d == 0);
        System.out.println(isOdd);
    }
}
