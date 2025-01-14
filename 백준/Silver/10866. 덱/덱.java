import java.io.IOException;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Deque;
import java.util.ArrayDeque;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        Deque<Integer> deque = new ArrayDeque<>();

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String command = st.nextToken();

            if (command.equals("push_front")) {
                int value = Integer.parseInt(st.nextToken());
                deque.addFirst(value);
            } else if (command.equals("push_back")) {
                int value = Integer.parseInt(st.nextToken());
                deque.addLast(value);
            } else if (command.equals("pop_front")) {
                if (deque.isEmpty()) {
                    bw.write("-1\n");
                } else {
                    bw.write(deque.pollFirst() + "\n");
                }
            } else if (command.equals("pop_back")) {
                if (deque.isEmpty()) {
                    bw.write("-1\n");
                } else {
                    bw.write(deque.pollLast() + "\n");
                }
            } else if (command.equals("size")) {
                bw.write(deque.size() + "\n");
            } else if (command.equals("empty")) {
                if (deque.isEmpty()) {
                    bw.write("1\n");
                } else {
                    bw.write("0\n");
                }
            } else if (command.equals("front")) {
                if (deque.isEmpty()) {
                    bw.write("-1\n");
                } else {
                    bw.write(deque.peekFirst() + "\n");
                }
            } else if (command.equals("back")) {
                if (deque.isEmpty()) {
                    bw.write("-1\n");
                } else {
                    bw.write(deque.peekLast() + "\n");
                }
            }
        }
        bw.flush();
        bw.close();
        br.close();
    }
}