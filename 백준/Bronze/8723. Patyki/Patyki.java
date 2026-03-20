import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int max = Math.max(a, Math.max(b, c));
        if (max == a) {
            if (a == b && b == c) System.out.print(2);
            else if (max * max == b * b + c * c) System.out.print(1);
            else System.out.print(0);
        } else if (max == b) {
            if (a == b && b == c) System.out.print(2);
            else if (max * max == c * c + a * a) System.out.print(1);
            else System.out.print(0);
        } else if (max == c) {
            if (a == b && b == c) System.out.print(2);
            else if (max * max == a * a + b * b) System.out.print(1);
            else System.out.print(0);
        }
    }
}