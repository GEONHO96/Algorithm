import java.io.IOException;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;
import java.util.Set;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) throws IOException {
         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
         BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
         StringTokenizer st = new StringTokenizer(br.readLine());
         int N = Integer.parseInt(st.nextToken());
         int Q = Integer.parseInt(st.nextToken());
         Set<Integer> occupied = new HashSet<>();
         for (int i = 0; i < Q; i++) {
             int want = Integer.parseInt(br.readLine());
             int current = want;
             int conflict = 0;
             while (current > 0) {
                 if (occupied.contains(current)) {
                     conflict = current;
                 }
                 current /= 2;
             }
             if (conflict == 0) {
                 occupied.add(want);
             }
             bw.write(conflict + "\n");
         }
         bw.flush();
         bw.close();
         br.close();
    }
}