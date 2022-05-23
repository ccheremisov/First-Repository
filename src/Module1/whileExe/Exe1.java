package Module1.whileExe;

import java.util.Scanner;

public class Exe1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите отрезок А: ");
        int a = scanner.nextInt();
        System.out.println("Введите отрезок В: ");
        int b = scanner.nextInt();
        if (a > b) {
            while (a >= 0) {
                a -= b;
            }
            System.out.println("Незанятая часть отрезка А равна: " + (a + b));
        } else {
            System.out.println("Ошибка!");
        }
    }
}
