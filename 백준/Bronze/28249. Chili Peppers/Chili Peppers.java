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
        int price = 0;
        for (int i = 0; i < N; i++) {
            String T = br.readLine();
            if (T.equals("Poblano")) price += 1500;
            if (T.equals("Mirasol")) price += 6000;
            if (T.equals("Serrano")) price += 15500;
            if (T.equals("Cayenne")) price += 40000;
            if (T.equals("Thai")) price += 75000;
            if (T.equals("Habanero")) price += 125000;
        }
        bw.write(String.valueOf(price));
        bw.flush();
        bw.close();
        br.close();
    }
}