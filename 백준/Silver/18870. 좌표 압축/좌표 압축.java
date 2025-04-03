import java.io.IOException;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        int[] coordinates = new int[N];
        int[] sorted = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        Map<Integer, Integer> compressed = new HashMap<>();
        for (int i = 0; i < N; i++) {
            coordinates[i] = Integer.parseInt(st.nextToken());
            sorted[i] = coordinates[i];
        }
        Arrays.sort(sorted);
        int index = 0;
        for (int num : sorted) {
            if (!compressed.containsKey(num)) {
                compressed.put(num, index++);
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < N; i++) {
            sb.append(compressed.get(coordinates[i])).append(" ");
        }
        bw.write(sb.toString().trim());
        bw.flush();
        bw.close();
        br.close();
    }
}