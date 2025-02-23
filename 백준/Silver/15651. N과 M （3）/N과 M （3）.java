import java.util.Scanner;

public class Main {
    static boolean[] c = new boolean[10];
    static int[] a = new int[10];
    static StringBuilder go(int index, int N, int M) {
        if (index == M) {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < M; i++) {
                sb.append(a[i]);
                if (i != M - 1) sb.append(" ");
            }
            sb.append("\n");
            return sb;
        }
        StringBuilder ans = new StringBuilder();
        for (int i = 1; i <= N; i++) {
            c[i] = true;
            a[index] = i;
            ans.append(go(index + 1, N, M));
            c[i] = false;
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        System.out.println(go(0, N, M));
    }
}