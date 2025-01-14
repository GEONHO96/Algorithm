import java.util.StringTokenizer;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static int K;
    public static int N;
    public static long max;
    public static long[] arr;

    public static boolean isSatisfied(long mid) {
        long sum = 0;
        for (int i = 0; i < K; i++) {
            sum += (arr[i] / mid);
        }
        if (sum >= N) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        K = Integer.parseInt(st.nextToken());
        N = Integer.parseInt(st.nextToken());
        arr = new long[K];
        for (int i = 0; i < K; i++) {
            arr[i] = Long.parseLong(br.readLine());
            max = Math.max(max, arr[i]);
        }
        long left = 1;
        long right = max;
        while (left <= right) {
            long mid = (left + right) / 2;
            if (isSatisfied(mid)) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        System.out.println(right);
    }
}