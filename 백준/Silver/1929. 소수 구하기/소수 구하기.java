import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static int MAX = 1000001;
    public static boolean[] isPrime = new boolean[MAX];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int M = sc.nextInt();
        int N = sc.nextInt();
        sieveOfEratosthenes();
        for (int i = M; i <= N; i++) {
            if (isPrime[i]) {
                System.out.println(i);
            }
        }
    }

    /**
     * 에라토스테네스의 체(sieveOfEratosthenes)
     */
    public static void sieveOfEratosthenes() {
        Arrays.fill(isPrime, true);
        isPrime[0] = false;
        isPrime[1] = false;
        for (int i = 2; i * i < MAX; i++) {
            if (isPrime[i]) {
                for (int j = i * i; j < MAX; j += i) {
                    isPrime[j] = false;
                }
            }
        }
    }
}