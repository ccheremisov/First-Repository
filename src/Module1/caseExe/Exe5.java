package Module1.caseExe;

import java.util.Scanner;

public class Exe5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите порядковый номер действия выполняемого числами А и В: ");
        int arefVurog = scanner.nextInt();
        System.out.println("Введите целое цисло А: ");
        int a = scanner.nextInt();
        System.out.println("Введите целое число В: ");
        int b = scanner.nextInt();
        if (b != 0) {
            switch (arefVurog) {
                case 1:
                    int slog = a + b;
                    System.out.println("Действие сложения чисел А и В: " + slog);
                    break;
                case 2:
                    int vuch = a - b;
                    System.out.println("Действие вычитания чисел А и В: " + vuch);
                    break;
                case 3:
                    int ymnog = a * b;
                    System.out.println("Действие умножения чисел А и В: " + ymnog);
                    break;
                case 4:
                    int delen = a / b;
                    System.out.println("Действие деления чисел А и В: " + delen);
                    break;
                default:
                    System.out.println("Ошибка! Число введено не в диапозоне выполняемых действий");
            }
        } else {
            System.out.println("Ошибка! Число В - не должно равнятся 0");
        }
    }
}
