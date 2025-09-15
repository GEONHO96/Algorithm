import java.io.IOException;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String word = br.readLine();
        int n = word.length();
        String newWord = "";
        for (int i = n - 1; i >= 0; i--) {
            newWord += word.charAt(i);
        }
        if (newWord.equals(word)) bw.write("true");
        else bw.write("false");
        bw.flush();
        bw.close();
        br.close();
    }
}