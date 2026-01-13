import java.io.IOException;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        while (true) {
            String str = br.readLine();
            if (str.equals("end")) break;
            else if (str.equals("animal")) bw.write("Panthera tigris\n");
            else if (str.equals("flower")) bw.write("Forsythia koreana\n");
            else if (str.equals("tree")) bw.write("Pinus densiflora\n");
        }
        bw.flush();
        bw.close();
        br.close();
    }
}