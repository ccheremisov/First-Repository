package Module1.ifAndElse;

import java.util.Scanner;

public class Exe11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите переменную целого типа А: ");
        int a = scanner.nextInt();
        System.out.println("Введите переменную целого типа В: ");
        int b = scanner.nextInt();
        if (a == b) {
            a = 0;
            b = 0;
            System.out.println("A: " + a + " B: " + b);
        } else {
            if (a > b) {
                b = a;
                a = a;
            } else if (a < b) {
                b = b;
                a = b;
            }
            System.out.println("A: " + a + " B: " + b);
        }
    }
}
