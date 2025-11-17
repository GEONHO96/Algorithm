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
        int length = word.length();
        StringBuilder newWord = new StringBuilder();
        for (int i = length - 1; i >= 0; i--) {
            newWord.append(word.charAt(i));
        }
        if (word.equals(newWord.toString())) bw.write("1");
        else bw.write("0");
        bw.flush();
        bw.close();
        br.close();
    }
}