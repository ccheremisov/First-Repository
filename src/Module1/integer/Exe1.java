package Module1.integer;

import java.util.Scanner;

public class Exe1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите длину в сантиметрах");
        int L = scanner.nextInt();
        int result = L / 100;
        System.out.println(result);
    }
}
