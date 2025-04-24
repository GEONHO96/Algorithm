class Solution {
    public int solution(int a, int b, int c, int d) {
        int ans = 0;
        int p = 0;
        int q = 0;
        int r = 0;
        int min = 6;
        if (a == b && b == c && c == d) {
            p = a;
            ans = 1111 * p;
        } else if (a == b && b == c && c == a && a != d) {
            p = a;
            q = d;
            ans = (10 * p + q) * (10 * p + q);
        } else if (b == c && c == d && d == b && b != a) {
            p = b;
            q = a;
            ans = (10 * p + q) * (10 * p + q);
        } else if (c == d && d == a && a == c && c != b) {
            p = c;
            q = b;
            ans = (10 * p + q) * (10 * p + q);
        } else if (d == a && a == b && b == d && d != c) {
            p = d;
            q = c;
            ans = (10 * p + q) * (10 * p + q);
        } else if (a == b && c == d && a != c) {
            p = a;
            q = c;
            ans = (p + q) * Math.abs(p - q);
        } else if (a == c && b == d && a != b) {
            p = a;
            q = b;
            ans = (p + q) * Math.abs(p - q);
        } else if (a == d && b == c && a != b) {
            p = a;
            q = b;
            ans = (p + q) * Math.abs(p - q);
        } else if (a == b && c != d && a != c) {
            p = a;
            q = c;
            r = d;
            ans = q * r;
        } else if (a == c && b != d && a != b) {
            p = a;
            q = b;
            r = d;
            ans = q * r;
        } else if (a == d && b != c && a != b) {
            p = a;
            q = b;
            r = c;
            ans = q * r;
        } else if (b == c && a != d && b != a) {
            p = b;
            q = a;
            r = d;
            ans = q * r;
        } else if (b == d && a != c && b != a) {
            p = b;
            q = a;
            r = c;
            ans = q * r;
        } else if (c == d && a != b && c != a) {
            p = c;
            q = a;
            r = b;
            ans = q * r;
        } else if (a != b && a != c && a != d && b != c && b != d && c != d) {
            min = Math.min(min, a);
            min = Math.min(min, b);
            min = Math.min(min, c);
            min = Math.min(min, d);
            ans = min;
        }
        return ans;
    }
}