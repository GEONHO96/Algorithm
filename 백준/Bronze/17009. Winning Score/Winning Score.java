import java.io.IOException;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int[] apple = new int[3];
        int[] banana = new int[3];
        int appleScore = 0;
        int bananaScore = 0;
        for (int i = 0; i < 3; i++) {
            apple[i] = Integer.parseInt(br.readLine());
            appleScore += (3 - i) * apple[i];
        }
        for (int i = 0; i < 3; i++) {
            banana[i] = Integer.parseInt(br.readLine());
            bananaScore += (3 - i) * banana[i];
        }
        if (appleScore > bananaScore) bw.write("A");
        else if (appleScore < bananaScore) bw.write("B");
        else bw.write("T");
        bw.flush();
        bw.close();
        br.close();
    }
}