import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String message = sc.next();
        StringBuilder S = new StringBuilder();
        for (int i = 0; i < message.length(); i++) {
            S.append(Character.toUpperCase(message.charAt(i)));
        }
        System.out.println(S);
    }
}