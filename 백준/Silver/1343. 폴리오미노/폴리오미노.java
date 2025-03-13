import java.io.IOException;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String board = br.readLine();
        String result = solve(board);
        bw.write(result);
        bw.newLine();
        bw.flush();
        bw.close();
        br.close();
    }
    public static String solve(String board) {
        StringBuilder sb = new StringBuilder();
        int count = 0;
        for (int i = 0; i < board.length(); i++) {
            char ch = board.charAt(i);
            if (ch == 'X') {
                count++;
            } else {
                if (!fill(sb, count)) return "-1";
                sb.append('.');
                count = 0;
            }
        }
        if (!fill(sb, count)) return "-1";
        return sb.toString();
    }
    public static boolean fill(StringBuilder sb, int count) {
        while (count >= 4) {
            sb.append("AAAA");
            count -= 4;
        }
        while (count >= 2) {
            sb.append("BB");
            count -= 2;
        }
        return count == 0;
    }
}