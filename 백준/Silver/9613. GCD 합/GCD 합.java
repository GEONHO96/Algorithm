import java.util.Scanner;

public class Main {
    public static long GCD(long a, long b) {
        long temp = 0;
        while (b > 0) {
            temp = a;
            a = b;
            b = temp % a;
        }
        return a;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long t = sc.nextLong();
        for (long i = 0; i < t; i++) {
            long n = sc.nextLong();
            long[] arr = new long[(int) n];
            long sum = 0;
            for (long j = 0; j < n; j++) {
                arr[(int) j] = sc.nextLong();
            }
            for (long j = 0; j < n - 1; j++) {
                for (long k = j + 1; k < n; k++) {
                    sum += GCD(arr[(int) k], arr[(int) j]);
                }
            }
            System.out.println(sum);
        }
    }
}