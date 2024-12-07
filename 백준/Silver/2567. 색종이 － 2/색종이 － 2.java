import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[][] coloredPaper = new int[101][101];
        for (int i = 0; i < N; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            for (int j = x; j < x + 10; j++) {
                for (int k = y; k < y + 10; k++) {
                    coloredPaper[j][k] = 1;
                }
            }
        }
        int cnt = 0;
        int[] dx = {-1, 1, 0, 0};
        int[] dy = {0, 0, -1, 1};
        for (int i = 1; i <= 100; i++) {
            for (int j = 1; j <= 100; j++) {
                if (coloredPaper[i][j] == 1) {
                    for (int k = 0; k < 4; k++) {
                        int nx = i + dx[k];
                        int ny = j + dy[k];
                        if (coloredPaper[nx][ny] == 0) cnt++;
                    }
                }
            }
        }
        System.out.println(cnt);
    }
}