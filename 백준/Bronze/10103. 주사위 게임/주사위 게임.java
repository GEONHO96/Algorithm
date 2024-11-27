import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int A = 100;
        int B = 100;
        for (int i = 0; i < n; i++) {
            int C = sc.nextInt();
            int D = sc.nextInt();
            if (C > D) {
                B = B - C;
            }
            else if (C < D) {
                A = A - D;
            }
        }
        System.out.println(A);
        System.out.println(B);
    }
}