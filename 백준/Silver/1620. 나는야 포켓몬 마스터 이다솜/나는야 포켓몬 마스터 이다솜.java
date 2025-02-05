import java.io.IOException;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        String[] pokemonNames = new String[N + 1];
        HashMap<String, Integer> nameToIndex = new HashMap<>();

        for (int i = 1; i <= N; i++) {
            String name = br.readLine();
            pokemonNames[i] = name;
            nameToIndex.put(name, i);
        }

        for (int i = 0; i < M; i++) {
            String query = br.readLine();
            if (Character.isDigit(query.charAt(0))) {
                int index = Integer.parseInt(query);
                bw.write(pokemonNames[index]);
            } else {
                bw.write(String.valueOf(nameToIndex.get(query)));
            }
            bw.newLine();
        }

        bw.flush();
        bw.close();
        br.close();
    }
}