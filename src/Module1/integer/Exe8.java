package Module1.integer;

import java.util.Scanner;

public class Exe8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите двузначное число: ");
        int a = scanner.nextInt();
        int c = (a % 10) * 10;
        int b = (a / 10) + c;
        System.out.println("Число при перестановке цифр исходного числа равно: " + b);
    }
}
