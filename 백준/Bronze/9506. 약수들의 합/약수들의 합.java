import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            int n = Integer.parseInt(br.readLine());
            if (n == -1) {
                break;
            }
            int sum = 0;
            ArrayList<Integer> array = new ArrayList<>();

            for (int i = 1; i <= n - 1; i++) {
                if (n % i == 0) {
                    sum += i;
                    array.add(i);
                }
            }
            if (sum == n) {
                System.out.print(n + " = ");
                for (int i = 0; i < array.size() - 1; i++) {
                    System.out.print(array.get(i) + " + ");
                }
                System.out.println(array.get(array.size() - 1));
            } else {
                System.out.println(n + " is NOT perfect.");
            }
        }
    }
}