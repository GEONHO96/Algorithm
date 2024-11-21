import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }
        Arrays.sort(A);
        int M = sc.nextInt();
        for (int i = 0; i < M; i++) {
            int answer = 0;
            int l = 0;
            int r = N - 1;
            int k = sc.nextInt();
            while (l <= r) {
                int mid = (l + r) / 2;
                if (A[mid] == k) {
                    answer = 1;
                    break;
                }
                if (A[mid] > k) {
                    r = mid - 1;
                } else {
                    l = mid + 1;
                }
            }
            System.out.println(answer);
        }
    }
}