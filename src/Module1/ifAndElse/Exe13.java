package Module1.ifAndElse;

import java.util.Scanner;

public class Exe13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите целое число: ");
        int a = scanner.nextInt();
        System.out.println("Введите целое число: ");
        int b = scanner.nextInt();
        System.out.println("Введите целое число: ");
        int c = scanner.nextInt();
        if(b <= a && a <= c || b >= a && a >= c) {
            System.out.println("Это число является средним: " + a);
        }else if(a <= b && b <= c || a >= b && b >= c) {
            System.out.println("Это число является средним: " + b);
        } else {
            System.out.println("Это число является средним: " + c);
        }
    }
}
