package Module1.whileExe;

import java.util.Scanner;

public class Exe8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите целое число N: ");
        int n = scanner.nextInt();
        int k = 1;
        while (k * k <= n) {
            k++;
        }
        System.out.println("Наибольшее целое число K, квадрат которого не превосходит N: " + (k - 1));
    }
}
