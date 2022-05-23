package Module1.array;

import java.util.Scanner;

public class Exe1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите целое число N: ");
        int n = scanner.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < n; i++)
            a[i] = 1 + i * 2;

        for (int i = 0; i < n; i++)
            System.out.println("Положительные нечетные числа массива [" + i + "] = " + a[i]);
    }
}
