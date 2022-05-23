package Module1.whileExe;

import java.util.Scanner;

public class Exe11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("");
        int n = scanner.nextInt();
        int k = 0;
        int sum = 0;
        while (sum < n) {
            k++;
            sum += k;
        }
        System.out.printf("Наименьшее из целых чисел K = %s, для которых сумма 1 + 2 + . . . + K будет больше или равна N, и сама сумма равна: %s " ,k,sum);
    }
}
