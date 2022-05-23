package Module1.forExe;

import java.util.Scanner;

public class Exe7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите целое число А: ");
        int a = scanner.nextInt();
        System.out.println("Введите целое число В: ");
        int b = scanner.nextInt();
        if (a < b) {
            int sum = 0;
            for (int i = a; i <= b; i++) {
                sum += i;
            }
            System.out.println(sum);
        } else {
            System.out.println("Ошибка!");
        }
    }
}
