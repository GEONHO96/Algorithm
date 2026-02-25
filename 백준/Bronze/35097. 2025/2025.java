import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            int n = sc.nextInt();
            int sum = 0;
            if (n == 0) break;
            else {
                for (int i = 1; i <= n; i++) {
                    for (int j = 1; j <= n; j++) {
                        sum += i * j;
                    }
                }
                System.out.println(sum);
            }
        }
    }
}