package Module1.ifAndElse;

import java.util.Scanner;

public class Exe1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите целое число: ");
        int a = scanner.nextInt();
        if (a > 0) {
            int b = a + 1;
            System.out.println("Число положительное с прибавлением еденицы равно: " + b);
        }
        else {
            System.out.println("Ошибка");
        }
    }
}
