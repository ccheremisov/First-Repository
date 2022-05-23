package Module1.series;

import java.util.Scanner;

public class Exe8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите целое число N: ");
        int n = scanner.nextInt();
        int count = 0;
        for (int i = 1; i <= n; i++) {
            System.out.printf("Введите целое число %s: ",i);
            int a = scanner.nextInt();
            if (a % 2 == 0) {
                System.out.println("Четное число: " + a + ", ");
                count++;
            }
        }
        System.out.println("Количество четных чисел равно: " + count);
    }
}
