import java.io.IOException;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.PriorityQueue;
import java.util.Collections;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        int dasom = Integer.parseInt(br.readLine());
        if (N == 1) {
            bw.write(0 + "\n");
            bw.flush();
            bw.close();
            br.close();
            return;
        }
        for (int i = 1; i < N; i++) {
            pq.add(Integer.parseInt(br.readLine()));
        }
        int count = 0;
        while (!pq.isEmpty() && pq.peek() >= dasom) {
            int max = pq.poll();
            max--;
            count++;
            dasom++;
            pq.add(max);
        }
        bw.write(count + "\n");
        bw.flush();
        bw.close();
        br.close();
    }
}