import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            char alphabet = sc.next().charAt(0);
            String sentence = sc.nextLine();
            if (alphabet == '#') break;
            int cnt = 0;
            for (int i = 0; i < sentence.length(); i++) {
                if (sentence.charAt(i) == alphabet) cnt++;
                if (sentence.charAt(i) == Character.toUpperCase(alphabet)) cnt++;
            }
            System.out.println(alphabet + " " + cnt);
        }
    }
}