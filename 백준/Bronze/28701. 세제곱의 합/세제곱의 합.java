import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int sum1 = (N * (N + 1)) / 2;
        int sum2 = 0;
        for (int i = N; i >= 1; i--) {
            sum2 += i;
        }
        sum2 *= sum2;
        int sum3 = ((N * (N + 1)) / 2) * ((N * (N + 1)) / 2);
        System.out.println(sum1);
        System.out.println(sum2);
        System.out.println(sum3);
    }
}