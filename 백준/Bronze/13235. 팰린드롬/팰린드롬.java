import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        String reverseS = "";
        for (int i = S.length() - 1; i >= 0; i--) {
            reverseS += S.charAt(i);
        }
        if (S.equals(reverseS)) System.out.println(true);
        else System.out.println(false);
    }
}