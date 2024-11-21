import java.util.Scanner;

public class Main {
    public static int N;
    public static long M;
    public static int[] trees = new int[N];
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextLong();
        long max = 0;
        int[] trees = new int[N];
        for (int i = 0; i < N; i++) {
            trees[i] = sc.nextInt();
            max = Math.max(max, trees[i]);
        }
        long l = 0;
        long r = max;

        while (l <= r) {
            long mid = (l + r) / 2;
            long sum = 0;
            for (int i = 0; i < trees.length; i++) {
                if (trees[i] > mid) {
                    sum += trees[i] - mid;
                }
            }
            if (sum >= M) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }
        System.out.println(r);
    }
}