package Module1.integer;

import java.util.Scanner;

public class Exe5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число отрезка А: ");
        int a = scanner.nextInt();
        System.out.println("Введите число отрезка B: ");
        int b = scanner.nextInt();
        if (a > b) {
            int c = a % b;
            System.out.println("Длина незанятой части отрезка А: " + c);
        }
        else {
            System.out.println("Ошибка");
        }
    }
}
