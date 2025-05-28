import java.io.IOException;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;
import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static class Pair {
        int value, index;
        Pair(int value, int index) {
            this.value = value;
            this.index = index;
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        int[] A = new int[N];
        Pair[] B = new Pair[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            A[i] = Integer.parseInt(st.nextToken());
            B[i] = new Pair(A[i], i);
        }
        Arrays.sort(B, Comparator.comparingInt(p -> p.value));
        int[] P = new int[N];
        for (int i = 0; i < N; i++) {
            P[B[i].index] = i;
        }
        for (int i = 0; i < N; i++) {
            bw.write(P[i] + " ");
        }
        bw.flush();
        bw.close();
        br.close();
    }
}