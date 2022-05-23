package Module1.booleantask;

import java.util.Scanner;

public class Exe1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите целое число: ");
        int a = scanner.nextInt();
        System.out.println("Введенное число является положительным?");
        boolean isPositive = a > -1;
        System.out.println(isPositive);
    }
}
