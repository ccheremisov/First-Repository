package Module1.array;

import java.util.Arrays;
import java.util.Scanner;

public class Exe4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите целое число N: ");
        int n = scanner.nextInt();
        System.out.println("Введите целое число A: ");
        int a = scanner.nextInt();
        System.out.println("Введите целое число D: ");
        int d = scanner.nextInt();

        int[] array = new int[n];
        array[0] = a;

        for (int i = 1; i < n; i++) {
            array[i] = array[i - 1] * d;
        }
        System.out.println(Arrays.toString(array));
    }
}
