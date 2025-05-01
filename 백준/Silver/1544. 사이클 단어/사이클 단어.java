import java.io.IOException;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Set;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        Set<String> uniqueCycleWords = new HashSet<>();
        for (int i = 0; i < N; i++) {
            String vocabulary = br.readLine();
            boolean isNew = true;
            for (String existing : uniqueCycleWords) {
                if (isCycleWord(existing, vocabulary)) {
                    isNew = false;
                    break;
                }
            }
            if (isNew) {
                uniqueCycleWords.add(vocabulary);
            }
        }
        bw.write(String.valueOf(uniqueCycleWords.size()));
        bw.flush();
        bw.close();
        br.close();
    }
    private static boolean isCycleWord(String a, String b) {
        if (a.length() != b.length()) return false;
        return (b + b).contains(a);
    }
}