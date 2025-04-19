class Solution {
    public int solution(int n) {
        String binaryFirst = Integer.toBinaryString(n);
        int m = binaryFirst.length();
        int p = 0;
        for (int i = 0; i < m; i++) {
            if (binaryFirst.charAt(i) == '1') p++;
        }
        int ans = n + 1;
        while (true) {
            int q = 0;
            String binarySecond = Integer.toBinaryString(ans);
            int l = binarySecond.length();
            for (int i = 0; i < l; i++) {
                if (binarySecond.charAt(i) == '1') q++;
            }
            if (p == q) break;
            ans++;
        }
        return ans;
    }
}