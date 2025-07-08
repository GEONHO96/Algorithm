import java.io.IOException;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        char alphabet = br.readLine().charAt(0);
        if (alphabet == 'N' || alphabet == 'n') bw.write("Naver D2");
        else bw.write("Naver Whale");
        bw.flush();
        bw.close();
        br.close();
    }
}