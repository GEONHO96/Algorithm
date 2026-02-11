import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int L = sc.nextInt();
        int R = sc.nextInt();
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }
        Arrays.sort(A, L - 1, R);
        for (int i = 0; i < N - 1; i++) {
            if (A[i] > A[i + 1]) {
                System.out.print(0);
                return;
            }
        }
        System.out.print(1);
    }
}