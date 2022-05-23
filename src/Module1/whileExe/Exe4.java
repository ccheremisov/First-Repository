package Module1.whileExe;

import java.util.Scanner;

public class Exe4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите целое число N: ");
        int n = scanner.nextInt();
        while (n % 3 == 0) {
            n = n / 3;
        }
        boolean stepin = n == 1;
        System.out.println(stepin);
        }
    }

