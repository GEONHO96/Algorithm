import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for (int i = 0; i < N + 2; i++) {
            for (int j = 0; j < N + 2; j++) {
                if ((i == 0 || j == 0 || i == N + 1) && (j != N + 1)) {
                    System.out.print("@");
                } else if (j == N + 1) {
                    System.out.println("@");
                } else {
                    System.out.print(" ");
                }
            }
        }
    }
}