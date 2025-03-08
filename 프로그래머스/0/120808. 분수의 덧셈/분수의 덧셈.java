class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int numerator = (numer1 * denom2 + numer2 * denom1) / gcd(denom1, denom2);
        int denominator = (denom1 * denom2) / gcd(denom1, denom2);
        int gcd = gcd(numerator, denominator);
        int[] answer = {numerator / gcd, denominator / gcd};
        return answer;
    }
    public int gcd(int a, int b) {
        int temp = 0;
        while (b > 0) {
            temp = a;
            a = b;
            b = temp % b;
        }
        return a;
    }
}