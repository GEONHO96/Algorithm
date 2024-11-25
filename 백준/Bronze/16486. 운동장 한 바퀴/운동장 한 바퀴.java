import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int d1 = sc.nextInt();
        int d2 = sc.nextInt();
        double circumference = 2 * d1 + 3.141592 * d2 * 2;
        System.out.printf("%.6f", circumference);
    }
}