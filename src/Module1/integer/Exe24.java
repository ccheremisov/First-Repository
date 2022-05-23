package Module1.integer;

import java.util.Scanner;

public class Exe24 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ввести целое число дня года: ");
        int a = scanner.nextInt();
        if (a >= 1 && a <= 365) {
            int result = a % 7;
            System.out.println("Номер дня недели равен: " + result + " исходя из того что 1 января было понедельником: 1");
        }
        else {
            System.out.println("Ошибка");
        }
    }
}
