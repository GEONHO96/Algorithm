import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int C = sc.nextInt();
        int K = sc.nextInt();
        int P = sc.nextInt();
        int wines = 0;
        for (int i = 1; i <= C; i++) {
            wines += K * i + P * i * i;
        }
        System.out.println(wines);
    }
}