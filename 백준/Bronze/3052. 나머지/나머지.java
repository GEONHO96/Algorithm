import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] remain = new int[42];
        for (int i = 0; i < 10; i++) {
            int A = sc.nextInt();
            remain[A % 42]++;
        }
        int cnt = 0;
        for (int i = 0; i < 42; i++) {
            if (remain[i] >= 1) cnt++;
        }
        System.out.println(cnt);
    }
}