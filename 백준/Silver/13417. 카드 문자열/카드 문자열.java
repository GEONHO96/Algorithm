import java.io.IOException;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;
import java.util.Deque;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int T = Integer.parseInt(br.readLine());
        while (T-- > 0) {
            int N = Integer.parseInt(br.readLine());
            StringTokenizer st = new StringTokenizer(br.readLine());
            Deque<Character> deque = new LinkedList<>();
            for (int i = 0; i < N; i++) {
                char c = st.nextToken().charAt(0);
                if (deque.isEmpty()) {
                    deque.add(c);
                } else {
                    if (deque.peekFirst() >= c) {
                        deque.addFirst(c);
                    } else {
                        deque.addLast(c);
                    }
                }
            }
            for (char ch : deque) {
                bw.write(ch);
            }
            bw.newLine();
        }
        bw.flush();
        bw.close();
        br.close();
    }
}