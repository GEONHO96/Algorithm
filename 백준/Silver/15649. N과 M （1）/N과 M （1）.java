import java.util.Scanner;

public class Main {
    static boolean[] c = new boolean[10];
    static int[] a = new int[10];
    static StringBuilder sb = new StringBuilder();
    static void go(int index, int N, int M) {
        if (index == M) {
            for (int i = 0; i < M; i++) {
                sb.append(a[i]);
                if (i != M) sb.append(" ");
            }
            sb.append("\n");
            return;
        }
        for (int i = 1; i <= N; i++) {
            if (c[i]) continue;
            c[i] = true;
            a[index] = i;
            go(index + 1, N, M);
            c[i] = false;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        go(0, N, M);
        System.out.println(sb.toString());
    }
}