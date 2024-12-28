import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T; i++) {
            int s = sc.nextInt();
            int n = sc.nextInt();
            int money = s;
            for (int j = 0; j < n; j++) {
                int q = sc.nextInt();
                int p = sc.nextInt();
                money += q * p;
            }
            System.out.println(money);
        }
    }
}