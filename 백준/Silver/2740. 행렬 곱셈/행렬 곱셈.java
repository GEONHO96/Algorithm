import java.io.IOException;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M1 = Integer.parseInt(st.nextToken());
        int[][] A = new int[N][M1];
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < M1; j++) {
                A[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        st = new StringTokenizer(br.readLine());
        int M2 = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        int[][] B = new int[M2][K];
        for (int i = 0; i < M2; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < K; j++) {
                B[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        int[][] C = new int[N][K];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < K; j++) {
                for (int k = 0; k < M1; k++) {
                    C[i][j] += A[i][k] * B[k][j];
                }
                bw.write(C[i][j] + " ");
            }
            bw.write("\n");
        }
        bw.flush();
        bw.close();
        br.close();
    }
}