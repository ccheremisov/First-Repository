package Module1.ifAndElse;

import java.util.Scanner;

public class Exe3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите целое число: ");
        int a = scanner.nextInt();
        if (a > 0) {
            int b = a + 1;
            System.out.println("Число положительное с прибавлением еденицы равно: " + b);
        }
        else if (a < 0) {
            int c = a - 2;
            System.out.println("Число отрицательное с вычетом двух равно: " + c);
        }
        else if (a == 0) {
            int d = a + 10;
            System.out.println("Число равное нулю, замененно на десять: " + d);
        }
    }
}
