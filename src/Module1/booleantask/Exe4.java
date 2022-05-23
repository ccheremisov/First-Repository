package Module1.booleantask;

import java.util.Scanner;

public class Exe4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите целое число: ");
        int a = scanner.nextInt();
        System.out.println("Введите целое число: ");
        int b = scanner.nextInt();
        System.out.println("Справедливы неравенства A > 2 и B <= 3 ?");
        boolean isRight = a > 2 && b <= 3;
        System.out.println(isRight);
    }
}
