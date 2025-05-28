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
        String input;
        while((input = br.readLine()) != null && !input.isEmpty()) {
            StringTokenizer st = new StringTokenizer(input);
            int N = Integer.parseInt(st.nextToken());
            int M = Integer.parseInt(st.nextToken());
            int count = 0;
            for (int i = N; i <= M; i++) {
                if (isUnique(i)) count++;
            }
            bw.write(count + "\n");
        }
        bw.flush();
        bw.close();
        br.close();
    } 
    public static boolean isUnique(int num) {
        boolean[] visited = new boolean[10];
        while (num > 0) {
            int digit = num % 10;
            if (visited[digit]) return false;
            visited[digit] = true;
            num /= 10;
        }
        return true;
    }
}