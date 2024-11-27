import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            String S = sc.nextLine();
            int cnt = 0;
            if (S.equals("#")) break;
            for (int i = 0; i < S.length(); i++) {
                if (S.charAt(i) == 'a' || S.charAt(i) == 'e' || S.charAt(i) == 'i' || S.charAt(i) == 'o' || S.charAt(i) == 'u' || S.charAt(i) == 'A' || S.charAt(i) == 'E' || S.charAt(i) == 'I' || S.charAt(i) == 'O' || S.charAt(i) == 'U') {
                    cnt++;
                }
            }
            System.out.println(cnt);
        }
    }
}