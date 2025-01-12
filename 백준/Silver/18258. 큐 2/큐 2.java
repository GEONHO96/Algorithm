import java.util.LinkedList;
import java.util.StringTokenizer;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        LinkedList<Integer> queue = new LinkedList<>();
        int N = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String command = st.nextToken();
            if (command.equals("push")) {
                int K = Integer.parseInt(st.nextToken());
                queue.add(K);
            } else if (command.equals("pop")) {
                if (queue.isEmpty()) {
                    sb.append(-1).append("\n");
                } else {
                    sb.append(queue.peek()).append("\n");
                    queue.poll();
                }
            } else if (command.equals("size")) {
                sb.append(queue.size()).append("\n");
            } else if (command.equals("empty")) {
                if (queue.isEmpty()) {
                    sb.append(1).append("\n");
                } else {
                    sb.append(0).append("\n");
                }
            } else if (command.equals("front")) {
                if (queue.isEmpty()) {
                    sb.append(-1).append("\n");
                } else {
                    sb.append(queue.peek()).append("\n");
                }
            } else if (command.equals("back")) {
                if (queue.isEmpty()) {
                    sb.append(-1).append("\n");
                } else {
                    sb.append(queue.getLast()).append("\n");
                }
            }
        }
        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }
}