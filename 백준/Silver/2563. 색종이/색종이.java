import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        boolean[][] coloredPaper = new boolean[101][101];
        int totalArea = 0;
        for (int i = 0; i < N; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            for (int j = x; j < x + 10; j++) {
                for (int k = y; k < y + 10; k++) {
                    if (!coloredPaper[j][k]) {
                        coloredPaper[j][k] = true;
                        totalArea++;
                    }
                }
            }
        }
        System.out.println(totalArea);
    }
}