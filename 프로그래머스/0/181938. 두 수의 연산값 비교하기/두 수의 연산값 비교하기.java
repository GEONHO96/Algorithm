class Solution {
    public int solution(int a, int b) {
        String c = String.valueOf(a) + String.valueOf(b);
        int d = 2 * a * b;
        return Integer.parseInt(c) > d ? Integer.parseInt(c) : d;
    }
}