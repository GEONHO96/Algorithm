import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int s = sc.nextInt();
            int n = sc.nextInt();
            int sum = 0;
            for (int j = 0; j < n; j++) {
                int q = sc.nextInt();
                int p = sc.nextInt();
                sum += q * p;
            }
            System.out.println(s + sum);
        }
    }
}