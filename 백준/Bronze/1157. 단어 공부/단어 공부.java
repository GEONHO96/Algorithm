import java.util.Scanner;

public class Main {

    public static int[] getAlphabetCount(String str) {
        int[] count = new int[26];
        for (int i = 0; i < str.length(); i++) {
            if ('A' <= str.charAt(i) && str.charAt(i) <= 'Z') {
                count[str.charAt(i) - 'A']++;
            }
            else count[str.charAt(i) - 'a']++;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int[] count = getAlphabetCount(str);

        int maxCount = -1;
        char maxAlphabetCount = '?';

        for (int i = 0; i < 26; i++) {
            if (count[i] > maxCount) {
                maxCount = count[i];
                maxAlphabetCount = (char) ('A' + i);
            }
            else if (count[i] == maxCount) {
                maxAlphabetCount = '?';
            }
        }
        System.out.println(maxAlphabetCount);
    }
}