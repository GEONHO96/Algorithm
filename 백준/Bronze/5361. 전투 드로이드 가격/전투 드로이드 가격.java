import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T; i++) {
            int A = sc.nextInt();
            int B = sc.nextInt();
            int C = sc.nextInt();
            int D = sc.nextInt();
            int E = sc.nextInt();
            double sum = A * 350.34 + B * 230.90 + C * 190.55 + D * 125.30 + E * 180.90;
            System.out.print("$");
            System.out.printf("%.2f\n", sum);
        }
    }
}