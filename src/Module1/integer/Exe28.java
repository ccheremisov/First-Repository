package Module1.integer;

import java.util.Scanner;

public class Exe28 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ввести целое число дня года: ");
        int a = scanner.nextInt();
        System.out.println("Ввести целое число дня недели: ");
        int n = scanner.nextInt();
        if (a >= 1 && a <= 365 && n >= 1 && n <= 7) {
            n = n - 2;
            int result = ((a + n) % 7) + 1;
            System.out.println(+ result);
        }
        else {
            System.out.println("Ошибка");
        }
    }
}
