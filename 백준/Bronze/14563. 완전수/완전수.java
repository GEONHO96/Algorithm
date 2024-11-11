import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for(int i = 0; i < T; i++) {
            int N = sc.nextInt();
            int sum = 0;
            for (int j = 1; j < N; j++) {
                if (N % j == 0) {
                    sum += j;
                }
            }
            if (sum > N) {
                System.out.println("Abundant");
            } else if (sum == N) {
                System.out.println("Perfect");
            } else {
                System.out.println("Deficient");
            }
        }
    }
}