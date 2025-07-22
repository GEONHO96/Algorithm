import java.io.IOException;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] equation = br.readLine().split(" ");
        int a = Integer.parseInt(equation[0]);
        int b = Integer.parseInt(equation[2]);
        int c = Integer.parseInt(equation[4]);
        if (a + b == c) bw.write("YES");
        else bw.write("NO");
        bw.flush();
        bw.close();
        br.close();
    }
}