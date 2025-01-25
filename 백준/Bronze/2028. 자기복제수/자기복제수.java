import java.util.Scanner;

public class Main {
    public static void main(String[] ags) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 1; i <= T; i++) {
            int N = sc.nextInt();
            int cnt = 0;
            int M = N * N;
            while (M >= N) {
                M /= 10;
                cnt++;
            }
            int K = N * N;
            if (K % (Math.pow(10, cnt)) == N) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}