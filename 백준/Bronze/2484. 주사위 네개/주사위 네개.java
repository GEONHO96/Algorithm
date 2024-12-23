import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int max = 0;
        for (int i = 0; i < N; i++) {
            int price = 0;
            int best = 0;
            int A = sc.nextInt();
            best = Math.max(best, A);
            int B = sc.nextInt();
            best = Math.max(best, B);
            int C = sc.nextInt();
            best = Math.max(best, C);
            int D = sc.nextInt();
            best = Math.max(best, D);
            if (A == B && B == C && C == D) {
                price = 50000 + A * 5000;
            }
            else if (A == B && B == C && C != D) {
                price = 10000 + A * 1000;
            }
            else if (B == C && C == D && D != A) {
                price = 10000 + B * 1000;
            }
            else if (C == D && D == A && A != B) {
                price = 10000 + C * 1000;
            }
            else if (D == A && A == B && B != C) {
                price = 10000 + D * 1000;
            }
            else if (A == B && C == D) {
                price = 2000 + A * 500 + C * 500;
            }
            else if (B == C && D == A) {
                price = 2000 + B * 500 + D * 500;
            }
            else if (C == A && D == B) {
                price = 2000 + C * 500 + D * 500;
            }
            else if (A == B && C != D && A != C && A != D) {
                price = 1000 + A * 100;
            }
            else if (B == C && D != A && B != D && B != A) {
                price = 1000 + B * 100;
            }
            else if (C == D && A != B && C != A && C != B) {
                price = 1000 + C * 100;
            }
            else if (D == A && B != C && D != B && D != C) {
                price = 1000 + D * 100;
            }
            else if (A == C && B != D && A != B && A != D) {
                price = 1000 + A * 100;
            }
            else if (B == D && A != C && B != C && B != A) {
                price = 1000 + B * 100;
            }
            else if (A != B && B != C && C != D && D != A) {
                price = best * 100;
            }
            max = Math.max(max, price);
        }
        System.out.println(max);
    }
}