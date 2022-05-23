package Module1.forExe;

import java.util.Scanner;

public class Exe4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите стоимость 1 кг. конфет: ");
        int a = scanner.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.printf("\nСтоимость %s кг. конфет: %s ",i,i * a);
        }
    }
}
