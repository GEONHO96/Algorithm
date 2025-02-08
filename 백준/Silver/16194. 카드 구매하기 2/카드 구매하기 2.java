import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] a = new int[N + 1];
        for (int i = 1; i <= N; i++) {
            a[i] = sc.nextInt();
        }
        int[] d = new int[N + 1];
        for (int i = 1; i <= N; i++) {
            d[i] = -1;
            for (int j = 1; j <= i; j++) {
                if (d[i] == -1 || d[i] > d[i - j] + a[j]) {
                    d[i] = d[i - j] + a[j];
                }
            }
        }
        System.out.println(d[N]);
    }
}