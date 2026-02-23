import java.io.IOException;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int[] burger = new int[3];
        for (int i = 0; i < 3; i++) {
            burger[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(burger);
        int[] coke = new int[2];
        for (int i = 0; i < 2; i++) {
            coke[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(coke);
        int cheapestSet = burger[0] + coke[0] - 50;
        bw.write(String.valueOf(cheapestSet));
        bw.flush();
        bw.close();
        br.close();
    }
}