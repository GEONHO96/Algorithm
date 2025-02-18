import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < N; i++) {
            String S = sc.nextLine();
            StringBuilder sb = new StringBuilder();
            for (int j = 0; j < S.length(); j++) {
                if (j == 0) sb.append(Character.toUpperCase(S.charAt(j)));
                else sb.append(S.charAt(j));
            }
            System.out.println(sb);
        }
        sc.close();
    }
}