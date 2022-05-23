package Module1.ifAndElse;

import java.nio.Buffer;
import java.util.Scanner;

public class Exe9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите переменную вещественного типа А: ");
        int a = scanner.nextInt();
        System.out.println("Введите переменную вещественного типа В:");
        int b = scanner.nextInt();
        System.out.println("Перераспределить значения так чтобы в А - было меньше значений, а в В - было больше значений");
        if (a > b) {
            a = a + b;
            b = a - b;
            a = a - b;
            System.out.println("A: " + a + " B: " + b);
        } else {
            System.out.println("A: " + a + " B: " + b);
        }
    }
}
