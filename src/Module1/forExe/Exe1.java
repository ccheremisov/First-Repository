package Module1.forExe;

import java.util.Scanner;

public class Exe1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите целое число N: ");
        int n = scanner.nextInt();
        System.out.println("Введите целое число K: ");
        int k = scanner.nextInt();
        if (n > 0) {
            System.out.printf("Значение %s выведино %s количестко раз:\n",k, n );
            for(int i = 0; i < n; i++) {
                System.out.println(k);
            }
        } else {
            System.out.println("Ошибка!");
        }
    }
}
