import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long N = sc.nextLong();
        long vertexCount = (1 + 4 * N + 3 * N * (N - 1) / 2);
        System.out.println(vertexCount % 45678);
    }
}