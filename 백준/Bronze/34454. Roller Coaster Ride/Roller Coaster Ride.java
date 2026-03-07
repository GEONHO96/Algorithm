import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int C = sc.nextInt();
        int P = sc.nextInt();
        if (N <= C * P) System.out.print("yes");
        else System.out.print("no");
    }
}