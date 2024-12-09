import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < 2 * N; j++) {
                if (i % 2 == 0) {
                    if (j % 2 == 0) {
                        System.out.print("*");
                    } else if (j % 2 == 1 && j != 2 * N - 1) {
                        System.out.print(" ");
                    } else if (j % 2 == 1 && j == 2 * N - 1) {
                        System.out.println();
                    }
                } else {
                    if (j % 2 == 1 && j != 2 * N - 1) {
                        System.out.print("*");
                    } else if (j % 2 == 0) {
                        System.out.print(" ");
                    } else if (j % 2 == 1 && j == 2 * N - 1) {
                        System.out.println("*");
                    }
                }
            }
        }
    }
}