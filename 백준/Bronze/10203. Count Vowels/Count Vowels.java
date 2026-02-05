import java.io.IOException;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        while (N-- > 0) {
            String w = br.readLine();
            int length = w.length();
            int vowels = 0;
            for (int i = 0; i < length; i++) {
                if (w.charAt(i) == 'a' || w.charAt(i) == 'e' || w.charAt(i) == 'i' || w.charAt(i) == 'o' || w.charAt(i) == 'u') vowels++;
            }
            bw.write("The number of vowels in " + w + " is " + vowels + ".\n");
        }
        bw.flush();
        bw.close();
        br.close();
    }
}