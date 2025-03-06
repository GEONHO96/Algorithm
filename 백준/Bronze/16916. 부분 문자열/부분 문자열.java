import java.util.Scanner;

public class Main {
    static int mod = 127;
    static int base = 256;
    static int h(String S) {
        int ans = 0;
        for (char ch : S.toCharArray()) {
            ans = (ans * base + ch) % mod;
        }
        return ans;
    }
    static int match(String S, String P) {
        int n = S.length();
        int m = P.length();
        if (n < m) return 0;
        int hash_p = h(P);
        int hash_s = h(S.substring(0, m));
        int first = 1;
        for (int i = 0; i < m - 1; i++) {
            first = (first * base) % mod;
        }
        for (int i = 0; i <= n - m; i++) {
            if (hash_p == hash_s) {
                if (S.substring(i, i + m).equals(P)) return 1;
            }
            if (i + m < n) {
                hash_s = hash_s - (S.charAt(i) * first) % mod;
                hash_s = (hash_s + mod) % mod;
                hash_s = ((hash_s * base) % mod + S.charAt(i + m)) % mod;
            }
        }
        return 0;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        String P = sc.next();
        System.out.println(match(S, P));
    }
}