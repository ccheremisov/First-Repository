package Module1.forExe;

import java.util.Scanner;

public class Exe6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите стоимость 1 кг. конфет: ");
        int a = scanner.nextInt();
        for (double i = 1; i <= 2; i += 0.2) {
            System.out.printf("\nСтоимость %.1f кг. конфет: %.1f ",i,i * a);
        }
    }
}
