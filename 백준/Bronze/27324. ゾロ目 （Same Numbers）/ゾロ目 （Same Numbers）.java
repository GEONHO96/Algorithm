import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        if (N % 10 == N / 10) System.out.print(1);
        else System.out.print(0);
    }
}