import java.util.Scanner;

public class Main {
    public static long gcd(long a, long b) {
        long temp = 0;
        while (b > 0) {
            temp = a;
            a = b;
            b = temp % b;
        }
        return a;
    }

    public static long lcm(long a, long b) {
        return a * b / gcd(a,  b);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        for (int i = 0; i < n; i++) {
            long a = sc.nextLong();
            long b = sc.nextLong();
            System.out.println(lcm((int)a, (int)b));
        }
    }
}