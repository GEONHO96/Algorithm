import java.util.Scanner;

public class Main {
    public static int K;
    public static int N;
    public static long max;
    public static long[] arr;

    public static boolean function(long mid) {
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
        arr = new long[K];
        for (int i = 0; i < K; i++) {
            arr[i] = sc.nextLong();
            max = Math.max(max, arr[i]);
        }
        long left = 1;
        long right = max;
        while (left <= right) {
            long mid = (left + right) / 2;
            if (function(mid)) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        System.out.println(right);
    }
}