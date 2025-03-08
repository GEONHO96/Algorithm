import java.util.Scanner;

public class Main {
    public static int gcd(int a, int b) {
        int temp;
        while (b > 0) {
            temp = a;
            a = b;
            b = temp % b;
        }
        return a;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numerator1 = sc.nextInt();
        int denominator1 = sc.nextInt();
        int numerator2 = sc.nextInt();
        int denominator2 = sc.nextInt();
        int numerator = ((numerator1 * denominator2) + (numerator2 * denominator1)) / gcd(denominator1, denominator2);
        int denominator = (denominator1 * denominator2) / gcd(denominator1, denominator2);
        int gcd = gcd(numerator, denominator);
        System.out.println(numerator / gcd + " " + denominator / gcd);
    }
}