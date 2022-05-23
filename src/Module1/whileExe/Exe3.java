package Module1.whileExe;

import java.util.Scanner;

public class Exe3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите целое положительное число N: ");
        int n = scanner.nextInt();
        System.out.println("Введите целое положительное число K:");
        int k = scanner.nextInt();
        int counter = 0;
        while (n >= k) {
            n -= k;
            counter++;
        }
        System.out.println("Частное числа N равно: " + counter);
        System.out.println("Остаток от деления N на K равен: " + n);
    }
}
