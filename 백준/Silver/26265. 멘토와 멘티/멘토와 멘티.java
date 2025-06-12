import java.io.IOException;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        List<String[]> list = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            String[] part = br.readLine().split(" ");
            list.add(part);
        }
        list.sort((a, b) -> {
            if (!a[0].equals(b[0])) {
                return a[0].compareTo(b[0]);
            } else {
                return b[1].compareTo(a[1]);
            }
        });
        for (String[] part : list) {
            bw.write(part[0] + " " + part[1]);
            bw.newLine();
        }
        bw.flush();
        bw.close();
        br.close();
    }
}