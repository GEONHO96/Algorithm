import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static int whitePaper;
    public static int bluePaper;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[][] coloredPaper = new int[N][N];
        StringTokenizer st;
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < N; j++) {
                coloredPaper[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        divideAndConquer(coloredPaper, 0, 0, N);
        System.out.println(whitePaper);
        System.out.println(bluePaper);
    }

    public static void divideAndConquer(int[][] paper, int x, int y, int size) {
        if (isUniformed(paper, x, y, size)) {
            if (paper[x][y] == 0) {
                whitePaper++;
            } else {
                bluePaper++;
            }
            return;
        }
        int newSize = size / 2;
        divideAndConquer(paper, x, y, newSize);
        divideAndConquer(paper, x, y + newSize, newSize);
        divideAndConquer(paper, x + newSize, y, newSize);
        divideAndConquer(paper, x + newSize, y + newSize, newSize);
    }

    public static boolean isUniformed(int[][] paper, int x, int y, int size) {
        int firstColor = paper[x][y];
        for (int i = x; i < x + size; i++) {
            for (int j = y; j < y + size; j++) {
                if (paper[i][j] != firstColor) {
                    return false;
                }
            }
        }
        return true;
    }
}