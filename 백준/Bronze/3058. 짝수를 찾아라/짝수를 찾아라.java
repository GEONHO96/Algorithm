import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T; i++) {
            int[] a = new int[7];
            int min = 0;
            int sum = 0;
            for (int j = 0; j < 7; j++) {
                a[j] = sc.nextInt();
                if (a[j] % 2 == 0) {
                    sum += a[j];
                }
            }
            Arrays.sort(a);
            for (int j = 0; j < 7; j++) {
                if (a[j] % 2 == 0) {
                    min = a[j];
                    break;
                }
            }
            System.out.println(sum + " " + min);
        }
    }
}