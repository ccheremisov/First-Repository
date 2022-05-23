package Module1.caseExe;

import java.util.Scanner;

public class Exe15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите порядковый номер в диапазоне 6 - 14: ");
        int n = scanner.nextInt();
        System.out.println("Введите порядковый нопер в диапазоне 1 - 4: ");
        int m = scanner.nextInt();
        if (1 <= m && m <= 4 && 6 <= n && n <= 14) {
            switch (m) {
                case 1:
                    System.out.print("Пик  ");
                    break;
                case 2:
                    System.out.print("Треф  ");
                    break;
                case 3:
                    System.out.print("Бубей  ");
                    break;
                case 4:
                    System.out.print("Червей  ");
                    break;
            }
            switch (n) {
                case 6:
                    System.out.print("Шестерка");
                    break;
                case 7:
                    System.out.print("Семерка");
                    break;
                case 8:
                    System.out.print("Восьмерка");
                    break;
                case 9:
                    System.out.print("Девятка");
                    break;
                case 10:
                    System.out.print("Десятка");
                    break;
                case 11:
                    System.out.print("Валет");
                    break;
                case 12:
                    System.out.print("Дама");
                    break;
                case 13:
                    System.out.print("Король");
                    break;
                case 14:
                    System.out.print("Туз");
                    break;
            }
        } else {
            System.out.println("Ошибка! Порядковый номер введены не в диапазоне!");
        }
    }
}
