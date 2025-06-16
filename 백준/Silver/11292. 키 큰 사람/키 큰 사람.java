import java.io.IOException;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.List;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        while (true) {
            int N = Integer.parseInt(br.readLine());
            if (N == 0) break;
            List<String> tallestPeople = new ArrayList<>();
            double maxHeight = -1.0;
            for (int i = 0; i < N; i++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                String name = st.nextToken();
                double height = Double.parseDouble(st.nextToken());
                if (height > maxHeight) {
                    tallestPeople.clear();
                    tallestPeople.add(name);
                    maxHeight = height;
                } else if (height == maxHeight) {
                    tallestPeople.add(name);
                }
            }
            for (int i = 0; i < tallestPeople.size(); i++) {
                if (i > 0) bw.write(" ");
                bw.write(tallestPeople.get(i));
            }
            bw.newLine();
        }
        bw.flush();
        bw.close();
        br.close();
    }
}