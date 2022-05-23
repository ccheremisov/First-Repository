package Module1.series;

import java.util.Scanner;

public class Exe4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите целое число N: ");
        int n = scanner.nextInt();
        int proiz = 0;
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            System.out.printf("Введите целое число %s: ",i);
            int a = scanner.nextInt();
            sum = sum + a;
            proiz = sum * a;
        }
        System.out.println("Сумма всех введеных чисел равна: " + sum);
        System.out.println("Произведение всех введеных чисел: " + proiz);
    }
}
