import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        System.out.print((int)(N * 0.78) + " " + (int)(N * 0.8 + N * 0.20 * 0.78));
    }
}