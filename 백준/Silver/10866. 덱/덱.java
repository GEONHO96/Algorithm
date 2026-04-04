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
            if (command[0].equals("push_front")) {
                int X = Integer.parseInt(command[1]);
                deque.addFirst(X);
            } else if (command[0].equals("push_back")) {
                int X = Integer.parseInt(command[1]);
                deque.addLast(X);
            } else if (command[0].equals("pop_front")) {
                if (deque.isEmpty()) {
                    bw.write("-1" + "\n");
                } else {
                    bw.write(deque.removeFirst() + "\n");
                }
            } else if (command[0].equals("size")) {
                bw.write(deque.size() + "\n");
            } else if (command[0].equals("pop_back")) {
                if (deque.isEmpty()) {
                    bw.write("-1" + "\n");
                } else {
                    bw.write(deque.removeLast() + "\n");
                }
            } else if (command[0].equals("empty")) {
                if (deque.isEmpty()) {
                    bw.write("1" + "\n");
                } else {
                    bw.write("0" + "\n");
                }
            } else if (command[0].equals("front")) {
                if (deque.isEmpty()) {
                    bw.write("-1" + "\n");
                } else {
                    bw.write(deque.getFirst() + "\n");
                }
            } else if (command[0].equals("back")) {
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