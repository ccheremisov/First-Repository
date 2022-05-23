package Module1.integer;

import java.util.Scanner;

public class Exe18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число: ");
        int a = scanner.nextInt();
        if (a > 999) {
            int b = (a / 1000) % 10;
            System.out.println("Цифра соответствующая разряду тысяч в записи этого числа: " + b);
        }
        else {
            System.out.println("Ошибка");
        }
    }
}
