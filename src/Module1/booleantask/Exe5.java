package Module1.booleantask;

import java.util.Scanner;

public class Exe5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите целое число: ");
        int a = scanner.nextInt();
        System.out.println("Введите целое число: ");
        int b = scanner.nextInt();
        System.out.println("Справедливы неравенства A >= 0 или B < -2 ?");
        boolean isRight = a >= 0 && b < -2;
        System.out.println(isRight);
    }
}
