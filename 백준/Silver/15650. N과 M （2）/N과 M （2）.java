import java.util.Scanner;

public class Main {
    static int[] a = new int[10];
    static void go(int index, int selected, int N, int M) {
        if (selected == M) {
            for (int i = 0; i < M; i++) {
                System.out.print(a[i]);
                if (i != M) System.out.print(" ");
            }
            System.out.println();
            return;
        }
        if (index > N) return;
        a[selected] = index;
        go(index + 1, selected + 1, N, M);
        a[selected] = 0;
        go(index + 1, selected, N, M);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        go(1, 0, N, M);
    }
}