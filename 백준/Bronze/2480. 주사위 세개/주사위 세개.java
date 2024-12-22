import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int price = 0;
        if (A == B && B == C) {
            price = 10000 + A * 1000;
        }
        if (A == B && B != C) {
            price = 1000 + A * 100;
        }
        if (B == C && C != A) {
            price = 1000 + B * 100;
        }
        if (C == A && A != B) {
            price = 1000 + C * 100;
        }
        if (A != B && B != C && C != A) {
            if (A > B && B > C) {
                price = A * 100;
            }
            if (B > C && C > A) {
                price = B * 100;
            }
            if (C > A && A > B) {
                price = C * 100;
            }
            if (A > C && C > B) {
                price = A * 100;
            }
            if (B > A && A > C) {
                price = B * 100;
            }
            if (C > B && B > A) {
                price = C * 100;
            }
        }
        System.out.println(price);
    }
}