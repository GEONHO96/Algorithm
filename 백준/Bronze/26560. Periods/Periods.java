import java.io.IOException;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        while (n-- > 0) {
            String sentence = br.readLine();
            int length = sentence.length();
            for (int i = 0; i < length; i++) {
                if (i != length - 1) {
                    bw.write(sentence.charAt(i));
                } else {
                    if (sentence.charAt(i) == '.') {
                        bw.write(".");
                    } else {
                        bw.write(sentence.charAt(i) +  ".");

                    }
                }
            }
            bw.write("\n");
        }
        bw.flush();
        bw.close();
        br.close();
    }
}