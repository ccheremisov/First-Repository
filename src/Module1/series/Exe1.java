package Module1.series;

import java.util.Scanner;

public class Exe1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            System.out.printf("Введите целое число %s: ",i);
            int a = scanner.nextInt();
            sum = sum + a;
        }
        System.out.println("Сумма всех введеных чисел равна: " + sum);
    }
}
