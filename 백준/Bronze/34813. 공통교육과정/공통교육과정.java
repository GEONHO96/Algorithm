import java.io.IOException;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String str = br.readLine();
        if (str.charAt(0) == 'F') bw.write("Foundation");
        if (str.charAt(0) == 'C') bw.write("Claves");
        if (str.charAt(0) == 'V') bw.write("Veritas");
        if (str.charAt(0) == 'E') bw.write("Exploration");
        bw.flush();
        bw.close();
        br.close();
    }
}