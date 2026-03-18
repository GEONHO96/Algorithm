import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int day = Integer.parseInt(st.nextToken());
        int size = 2*N-1;
        int[] up = new int[size+1];
        while(day-- > 0){
            st = new StringTokenizer(br.readLine());
            int zero = Integer.parseInt(st.nextToken());
            int one = zero + Integer.parseInt(st.nextToken());
            up[zero]++;
            up[one]++;
        }
        for(int i=0; i<size; i++){
            up[i+1] += up[i];
        }
        StringBuilder sb = new StringBuilder();
        for(int i=N-1; i>=0; i--){
            sb.append(up[i]+1);
            for(int j=N; j<size; j++){
                sb.append(" ").append(up[j]+1);
            }
            sb.append("\n");
        }
        System.out.print(sb);
    }
}