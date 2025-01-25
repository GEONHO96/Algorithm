import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 1; i <= T; i++) {
            int N = sc.nextInt();
            int M = N * N;
            int count = 0;
            while (M >= N) {
                M /= 10;
                count++;
            }
            int K = N * N;
            if (K % (Math.pow(10, count)) == N) System.out.println("YES");
            else System.out.println("NO");
        }        
    }
}