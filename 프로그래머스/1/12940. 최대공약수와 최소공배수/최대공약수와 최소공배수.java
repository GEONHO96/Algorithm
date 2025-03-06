class Solution {
    public static int gcd(int n, int m) {
        int temp = 0;
        while (m > 0) {
            temp = n;
            n = m;
            m = temp % m;
        }
        return n;
    }
    public static int lcm(int n, int m) {
        return n * m / gcd(n, m);
    }
    public int[] solution(int n, int m) {
        int[] answer = {gcd(n, m), lcm(n, m)};
        return answer;
    }
}