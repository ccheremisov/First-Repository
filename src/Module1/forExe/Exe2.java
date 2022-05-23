package Module1.forExe;

import java.util.Scanner;

public class Exe2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите целое число А: ");
        int a = scanner.nextInt();
        System.out.println("Введите целое число В: ");
        int b = scanner.nextInt();
        System.out.println("Число в диапазоне начиная с А: " + a);
        for (int i = a + 1; i < b; i++)
            System.out.println("Число в диапазоне между А и В: " + i);
        System.out.println("Число в диапазоне заканчивая В: " + b);
        System.out.println("Количиство чисел между А и В, включая их самих равно: " + (b - a + 1));
    }
}
