import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] S = sc.next().split(",");
        int len = S.length;
        int sum = 0;
        for (int i = 0; i < len; i++) {
            sum += Integer.parseInt(S[i]);
        }
        System.out.println(sum);
    }
}