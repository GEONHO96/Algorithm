import java.io.IOException;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Set;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] father = br.readLine().split(" ");
        String[] mother = br.readLine().split(" ");
        String[] parents = new String[4];
        parents[0] = father[0];
        parents[1] = father[1];
        parents[2] = mother[0];
        parents[3] = mother[1];
        Set<String> set = new HashSet<>(Arrays.asList(parents));
        String[] uniqueArray = set.toArray(new String[0]);
        Arrays.sort(uniqueArray);
        int length = uniqueArray.length;
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length; j++) {
                bw.write(uniqueArray[i] + " " + uniqueArray[j] + "\n");
            }
        }
        bw.flush();
        bw.close();
        br.close();
    }
}