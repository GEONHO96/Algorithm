import java.util.Scanner;

public class Main {
    public static int combination(int N) {
        int K = 1;
        if (N == 1) {
            return 0;
        }
        else {
            for (int i = N; i >= N - 1; i--) {
                K *= i;
            }
        }
        return K;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        System.out.println(combination(N));
    }
}