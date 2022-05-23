package Module1.booleantask;

import java.util.Scanner;

public class Exe22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите целое число: ");
        int a = scanner.nextInt();
        if (a > 99 && a < 1000) {
            int b = a % 10;
            int c = a / 100;
            int d = (a / 10) % 10;
            System.out.println("Цифры данного числа образуют возрастающую или убывающую последовательность ?");
            boolean isOdd = c < d && d < b || c > d && d > b;
            System.out.println(isOdd);
        }
        else {
            System.out.println("Ошибка");
        }
    }
}
