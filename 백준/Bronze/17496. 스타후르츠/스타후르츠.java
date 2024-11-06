import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int T = sc.nextInt();
        int C = sc.nextInt();
        int P = sc.nextInt();
        int profit = 0;
        if (N % T == 0) {
            profit = (N / T - 1) * C * P;
        } else {
            profit = (N / T) * C * P;
        }
        System.out.println(profit);
    }
}