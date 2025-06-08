import java.io.IOException;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.List;
import java.util.ArrayList;
import java.util.StringTokenizer;

class Person {
    int b, p, q, r;
    int difficulty, time;
    Person(int b, int p, int q, int r) {
        this.b = b;
        this.p = p;
        this.q = q;
        this.r = r;
        this.difficulty = p * q * r;
        this.time = p + q + r;
    }
}
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        List<Person> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int b = Integer.parseInt(st.nextToken());
            int p = Integer.parseInt(st.nextToken());
            int q = Integer.parseInt(st.nextToken());
            int r = Integer.parseInt(st.nextToken());
            list.add(new Person(b, p, q, r));
        }
        list.sort((a, b) -> {
            if (a.difficulty != b.difficulty)
                return Integer.compare(a.difficulty, b.difficulty);
            if (a.time != b.time)
                return Integer.compare(a.time, b.time);
            return Integer.compare(a.b, b.b);
        });
        for (int i = 0; i < 3; i++) {
            bw.write(list.get(i).b + " ");
        }
        bw.flush();
        bw.close();
        br.close();
    }
}