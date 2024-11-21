import java.util.Scanner;

public class Main {
    public static int K;
    public static int N;
    public static long max;
    public static long[] arr;

    public static boolean f(long mid) {
        long sum = 0;
        for (int i = 0; i < K; i++) {
            sum += (arr[i] / mid);
        }
        if (sum >= N) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        K = sc.nextInt();
        N = sc.nextInt();
        max = 0;
        arr = new long[K];
        for (int i = 0; i < K; i++) {
            arr[i] = sc.nextInt();
            max = Math.max(arr[i], max);
        }
        long l = 1;
        long r = max;
        while (l <= r) {
            long mid = (l + r) / 2;
            if (f(mid)) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }
        System.out.println(r);
    }
}