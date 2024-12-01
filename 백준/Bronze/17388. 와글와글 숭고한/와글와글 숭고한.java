import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int S = sc.nextInt();
        int K = sc.nextInt();
        int H = sc.nextInt();
        if (S + K + H >= 100) {
            System.out.println("OK");
        }else {
            if (S < K && K < H) {
                System.out.println("Soongsil");
            } else if (S < H && H < K) {
                System.out.println("Soongsil");
            } else if (K < H && H < S) {
                System.out.println("Korea");
            } else if (K < S && S < H) {
                System.out.println("Korea");
            } else if (H < S && S < K) {
                System.out.println("Hanyang");
            } else if (H < K && K < S) {
                System.out.println("Hanyang");
            }
        }
    }
}