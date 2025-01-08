import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.next();
        int length = word.length();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < length; i++) {
            if (word.charAt(i) == 'A') {
                sb.append("X");
            }
            else if (word.charAt(i) == 'B') {
                sb.append("Y");
            }
            else if (word.charAt(i) == 'C') {
                sb.append("Z");
            }
            else {
                sb.append((char)(word.charAt(i) - 3));
            }
        }
        System.out.println(sb);
    }
}