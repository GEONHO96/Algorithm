import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while (n-- > 0) {
            String word = sc.next();
            int length = word.length();
            int i = sc.nextInt();
            int j = sc.nextInt();
            StringBuilder sb = new StringBuilder();
            for (int k = 0; k < length; k++) {
                if (k >= i && k < j) {
                    continue;
                } else {
                    sb.append(word.charAt(k));
                }
            }
            System.out.println(sb.toString());
        }
    }
}