import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int C = sc.nextInt();
        int K = sc.nextInt();
        int P = sc.nextInt();
        int wine = 0;
        for (int i = 1; i <= C; i++) {
            wine += K * i + P * i * i;
        }
        System.out.println(wine);
    }
}