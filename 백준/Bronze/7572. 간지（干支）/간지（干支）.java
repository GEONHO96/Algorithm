import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        System.out.print((char)(((N % 12 + 8)) % 12 + 'A'));
        System.out.print((N % 10 + 6) % 10);
    }
}