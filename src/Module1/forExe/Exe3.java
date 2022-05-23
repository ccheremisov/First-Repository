package Module1.forExe;

import java.util.Scanner;

public class Exe3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите целое число А: ");
        int a = scanner.nextInt();
        System.out.println("Введите целое число В: ");
        int b = scanner.nextInt();
        for (int i = b - 1; i > a; i--)
            System.out.println("Число в диапазоне между А и В: " + i);
        System.out.println("Количиство чисел между А и В равно: " + (b - a - 1));
    }
}
