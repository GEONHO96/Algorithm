import java.util.Queue;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    static int[][] a;
    static int[][] d;
    static int N, M;
    final static int[] dx = {0, 0, 1, -1, 1, 1, -1, -1};
    final static int[] dy = {1, -1, 0, 0, 1, -1, 1, -1};
    static int go(int sx, int sy) {
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                d[i][j] = -1;
            }
        }
        d[sx][sy] = 0;
        Queue<Integer> q = new LinkedList<>();
        q.add(sx); q.add(sy);
        while (!q.isEmpty()) {
            int x = q.remove();
            int y = q.remove();
            for (int k = 0; k < 8; k++) {
                int nx = x + dx[k];
                int ny = y + dy[k];
                if (0 <= nx && nx < N && 0 <= ny && ny < M) {
                    if (d[nx][ny] == -1) {
                        if (a[nx][ny] == 1) {
                            return d[x][y] + 1;
                        } else {
                            q.add(nx); q.add(ny);
                            d[nx][ny] = d[x][y] + 1;
                        }
                    }
                }
            }
        }
        return 0;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();
        a = new int[N][M];
        d = new int[N][M];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                a[i][j] = sc.nextInt();
            }
        }
        int ans = 0;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if (a[i][j] == 0) {
                    int dist = go(i, j);
                    if (ans < dist) ans = dist;
                }
            }
        }
        System.out.println(ans);
    }
}