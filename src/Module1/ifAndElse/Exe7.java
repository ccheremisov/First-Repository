package Module1.ifAndElse;

import java.util.Scanner;

public class Exe7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите целое число: ");
        int a = scanner.nextInt();
        System.out.println("Введите целое число: ");
        int b = scanner.nextInt();
        int one = 0;
        int two = 1;
        if (a < b) {
            one ++;
            System.out.println("Порядковый номер меньшего из чисел:" + one);
        }
        if (a > b) {
            two ++;
            System.out.println("Порядковый номер меньшего из чисел: " + two);
        }
    }
}
