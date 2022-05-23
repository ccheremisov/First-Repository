package Module1.integer;

import java.util.Scanner;

public class Exe30 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите год: ");
        int a = scanner.nextInt();
        int b = ((a - 1) / 100) + 1;
        System.out.println("Столетие этого года равно: " + b + " в.");
    }
}
