import java.io.IOException;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;
import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int B = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(st.nextToken());
        int D = Integer.parseInt(st.nextToken());
        Integer[] burger = new Integer[B];
        Integer[] side = new Integer[C];
        Integer[] beverage = new Integer[D];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < B; i++) burger[i] = Integer.parseInt(st.nextToken());
        Arrays.sort(burger, Collections.reverseOrder());
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < C; i++) side[i] = Integer.parseInt(st.nextToken());
        Arrays.sort(side, Collections.reverseOrder());
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < D; i++) beverage[i] = Integer.parseInt(st.nextToken());
        Arrays.sort(beverage, Collections.reverseOrder());
        int originalPrice = 0;
        for (int i = 0; i < B; i++) originalPrice += burger[i];
        for (int i = 0; i < C; i++) originalPrice += side[i];
        for (int i = 0; i < D; i++) originalPrice += beverage[i];
        int min = Math.min(B, Math.min(C, D));
        int discountPrice = 0;
        for (int i = 0; i < min; i++) discountPrice += (int) ((burger[i] + side[i] + beverage[i]) * 0.9);
        for (int i = min; i < B; i++) discountPrice += burger[i];
        for (int i = min; i < C; i++) discountPrice += side[i];
        for (int i = min; i < D; i++) discountPrice += beverage[i];
        bw.write(originalPrice + "\n" + discountPrice);
        bw.flush();
        bw.close();
        br.close();
    }
}