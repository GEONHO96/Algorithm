import java.io.IOException;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int B = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(st.nextToken());
        int D = Integer.parseInt(st.nextToken());
        int min = 0;
        min = Math.min(B, Math.min(C, D));
        int originalPrice = 0;
        int discountPrice = 0;
        Integer[] burger = new Integer[B];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < B; i++) {
            burger[i] = Integer.parseInt(st.nextToken());
            originalPrice += burger[i];
        }
        Arrays.sort(burger, Collections.reverseOrder());
        Integer[] side = new Integer[C];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < C; i++) {
            side[i] = Integer.parseInt(st.nextToken());
            originalPrice += side[i];
        }
        Arrays.sort(side, Collections.reverseOrder());
        Integer[] beverage = new Integer[D];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < D; i++) {
            beverage[i] = Integer.parseInt(st.nextToken());
            originalPrice += beverage[i];
        }
        Arrays.sort(beverage, Collections.reverseOrder());
        for (int i = 0; i < min; i++) {
            discountPrice += 0.9 * (burger[i] + side[i] + beverage[i]);
        }
        for (int i = min; i < B; i++) {
            discountPrice += burger[i];
        }
        for (int i = min; i < C; i++) {
            discountPrice += side[i];
        }
        for (int i = min; i < D; i++) {
            discountPrice += beverage[i];
        }
        bw.write(String.valueOf(originalPrice) + "\n" + String.valueOf(discountPrice));
        bw.flush();
        bw.close();
        br.close();
    }
}