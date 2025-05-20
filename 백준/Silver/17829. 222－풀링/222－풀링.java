import java.io.IOException;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        int[][] matrix = new int[N][N];
        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < N; j++) {
                matrix[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        int result = pooling(matrix, 0, 0, N);
        bw.write(result + "\n");
        bw.flush();
        bw.close();
        br.close();
    }
    public static int pooling(int[][] arr, int x, int y, int size) {
        if (size == 2) {
            int[] temp = {
                    arr[x][y], arr[x + 1][y],
                    arr[x][y + 1], arr[x + 1][y + 1]
            };
            Arrays.sort(temp);
            return temp[2];
        }
        int half = size / 2;
        int[] pooled = new int[4];
        pooled[0] = pooling(arr, x, y, half);
        pooled[1] = pooling(arr, x + half, y, half);
        pooled[2] = pooling(arr, x, y + half, half);
        pooled[3] = pooling(arr, x + half, y + half, half);
        Arrays.sort(pooled);
        return pooled[2];
    }
}