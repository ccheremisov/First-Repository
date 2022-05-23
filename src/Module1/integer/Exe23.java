package Module1.integer;

import java.util.Scanner;

public class Exe23 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите сколько секунд прошло с начала суток N: ");
        int a = scanner.nextInt();
        int b = a % 3600 / 60;
        System.out.println("Количество полных минут прошедших с начала последнего часа: " + b);
    }
}
