import java.util.Scanner;

public class Main {
    public static boolean isPrimeNumber(int n) {
        if (n == 1) return false;
        else {
            for (int i = 2; i < n; i++) {
                if (n % i == 0)
                    return false;
            }
            return true;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];
        int cnt = 0;
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < N; i++) {
            if (isPrimeNumber(arr[i])) {
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}