import java.io.IOException;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(st.nextToken());
        HashMap<Integer, Integer> frequencyMap = new HashMap<>();
        LinkedHashMap<Integer, Integer> firstAppearanceMap = new LinkedHashMap<>();
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            int num = Integer.parseInt(st.nextToken());
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
            if (!firstAppearanceMap.containsKey(num)) {
                firstAppearanceMap.put(num, i);
            }
        }
        List<Integer> numbers = new ArrayList<>(frequencyMap.keySet());
        numbers.sort((a, b) -> {
            int freqCompare = frequencyMap.get(b).compareTo(frequencyMap.get(a));
            if (freqCompare == 0) {
                return firstAppearanceMap.get(a).compareTo(firstAppearanceMap.get(b));
            }
            return freqCompare;
        });
        for (int num : numbers) {
            int freq = frequencyMap.get(num);
            for (int i = 0; i < freq; i++) {
                bw.write(num + " ");
            }
        }
        bw.flush();
        bw.close();
        br.close();
    }
}