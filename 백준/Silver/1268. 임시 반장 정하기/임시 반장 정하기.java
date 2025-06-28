import java.io.IOException;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        int[][] classNumber = new int[N][5];
        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < 5; j++) {
                classNumber[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        int maxCount = -1;
        int studentNumber = 0;
        for (int i = 0; i < N; i++) {
            int count = 0;
            for (int j = 0; j < N; j++) {
                if (i == j) continue;
                for (int k = 0; k < 5; k++) {
                    if (classNumber[i][k] == classNumber[j][k]) {
                        count++;
                        break;
                    }
                }
            }
            if (maxCount < count) {
                maxCount = count;
                studentNumber = i + 1;
            }
        }
        bw.write(String.valueOf(studentNumber));
        bw.flush();
        bw.close();
        br.close();
    }
}