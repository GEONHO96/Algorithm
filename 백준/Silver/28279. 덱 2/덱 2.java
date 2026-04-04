import java.io.IOException;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        LinkedList<Integer> deque = new LinkedList<>();
        while (N-- > 0) {
            String[] command = br.readLine().split(" ");
            if (Integer.parseInt(command[0]) == 1) {
                int X = Integer.parseInt(command[1]);
                deque.addFirst(X);
            } else if (Integer.parseInt(command[0]) == 2) {
                int X = Integer.parseInt(command[1]);
                deque.addLast(X);
            } else if (Integer.parseInt(command[0]) == 3) {
                if (deque.isEmpty()) {
                    bw.write("-1" + "\n");
                } else {
                    bw.write(deque.removeFirst() + "\n");
                }
            } else if (Integer.parseInt(command[0]) == 4) {
                if (deque.isEmpty()) {
                    bw.write("-1" + "\n");
                } else {
                    bw.write(deque.removeLast() + "\n");
                }
            } else if (Integer.parseInt(command[0]) == 5) {
                bw.write(deque.size() + "\n");
            } else if (Integer.parseInt(command[0]) == 6) {
                if (deque.isEmpty()) {
                    bw.write("1" + "\n");
                } else {
                    bw.write("0" + "\n");
                }
            } else if (Integer.parseInt(command[0]) == 7) {
                if (deque.isEmpty()) {
                    bw.write("-1" + "\n");
                } else {
                    bw.write(deque.getFirst() + "\n");
                }
            } else if (Integer.parseInt(command[0]) == 8) {
                if (deque.isEmpty()) {
                    bw.write("-1" + "\n");
                } else {
                    bw.write(deque.getLast() + "\n");
                }
            }
        }
        bw.flush();
        bw.close();
        br.close();
    }
}