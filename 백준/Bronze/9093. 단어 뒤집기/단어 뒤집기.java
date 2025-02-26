import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < T; i++) {
            String sentence = sc.nextLine();
            String[] words = sentence.split(" ");
            for (int j = 0; j < words.length; j++) {
                StringBuilder newSentence = new StringBuilder();
                for (int k = words[j].length() - 1; k >= 0; k--) {
                    newSentence.append(words[j].charAt(k));
                }
                System.out.print(newSentence + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}