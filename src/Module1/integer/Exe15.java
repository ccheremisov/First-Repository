package Module1.integer;

import java.util.Scanner;

public class Exe15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите трехзначное число: ");
        int a = scanner.nextInt();
        int b = ((a / 10 % 10) * 10 + (a / 100)) * 10 + (a % 10);
        System.out.println("При перестановке цифр сотен и десятков исходного числа равно: " + b);
    }
}
