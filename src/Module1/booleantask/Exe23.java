package Module1.booleantask;

import java.util.Scanner;

public class Exe23 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите целое число: ");
        int a = scanner.nextInt();
        if (a > 999 && a < 10000) {
            System.out.println("Цифры данного числа образуют возрастающую или убывающую последовательность ?");
            boolean isOdd = a % 10 == a / 1000 && a % 100 / 10 == a % 1000 / 100;
            System.out.println(isOdd);
        }
        else {
            System.out.println("Ошибка");
        }
    }
}
