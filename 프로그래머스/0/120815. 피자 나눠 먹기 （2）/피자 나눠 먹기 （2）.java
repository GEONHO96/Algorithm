class Solution {
    public int solution(int n) {
        return lcm(n, 6) / 6;
    }
    public static int gcd(int a, int b) {
        int temp;
        while (b > 0) {
            temp = a;
            a = b;
            b = temp % b;
        }
        return a;
    }
    public static int lcm(int a, int b) {
        return a * b / gcd(a, b);
    }
}