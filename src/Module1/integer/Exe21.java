package Module1.integer;

import java.util.Scanner;

public class Exe21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите сколько секунд прошло с начала суток N: ");
        int a = scanner.nextInt();
        int b = a % 60;
        System.out.println("Количество секунд прошедших с начала последней минуты: " + b);
    }
}
