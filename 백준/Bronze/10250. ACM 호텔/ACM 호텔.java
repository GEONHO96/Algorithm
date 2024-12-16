import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T; i++) {
            int H = sc.nextInt();
            int W = sc.nextInt();
            int N = sc.nextInt();
            int roomNumber = 101;
            if (1 <= N && N <= H * W) {
                if (N % H == 0) {
                    roomNumber = roomNumber + (N / H - 1) + (H - 1) * 100;
                } else {
                    roomNumber = roomNumber + (N / H) + (N % H - 1) * 100;
                }
            }
            System.out.println(roomNumber);
        }
    }
}