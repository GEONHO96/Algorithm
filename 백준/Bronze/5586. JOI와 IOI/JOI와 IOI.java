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
        int cntJOI = 0;
        int cntIOI = 0;
        for (int i = 0; i < str.length() - 2; i++) {
            if (str.substring(i, i + 3).equals("IOI")) cntIOI++;
            if (str.substring(i, i + 3).equals("JOI")) cntJOI++;
        }
        bw.write(String.valueOf(cntJOI) + "\n");
        bw.write(String.valueOf(cntIOI));
        bw.flush();
        bw.close();
        br.close();
    }
}