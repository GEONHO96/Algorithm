import java.io.IOException;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        Stack<Integer> stack = new Stack<>();
        while (N-- > 0) {
            String[] command = br.readLine().split(" ");
            if (Integer.parseInt(command[0]) == 1) {
                int X = Integer.parseInt(command[1]);
                stack.push(X);
            } else if (Integer.parseInt(command[0]) == 2) {
                if (stack.isEmpty()) {
                    bw.write("-1\n");
                } else {
                    bw.write(stack.pop() + "\n");
                }
            } else if (Integer.parseInt(command[0]) == 3) {
                bw.write(stack.size() + "\n");
            } else if (Integer.parseInt(command[0]) == 4) {
                if (stack.isEmpty()) {
                    bw.write("1\n");
                } else {
                    bw.write("0\n");
                }
            } else if (Integer.parseInt(command[0]) == 5) {
                if (stack.isEmpty()) {
                    bw.write("-1\n");
                } else {
                    bw.write(stack.peek() + "\n");
                }
            }
        }
        bw.flush();
        bw.close();
        br.close();
    }
}