package Module1.booleantask;

import java.util.Scanner;

public class Exe3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите целое число: ");
        int a = scanner.nextInt();
        System.out.println("Введенное число является четным?");
        int b = a % 2;
        boolean isOdd = (b == 0);
        System.out.println(isOdd);
    }
}
