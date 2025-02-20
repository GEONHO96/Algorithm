class Solution {
    public int solution(int a, int b) {
        String c = String.valueOf(a) + String.valueOf(b);
        String d = String.valueOf(b) + String.valueOf(a);
        int e = Integer.parseInt(c);
        int f = Integer.parseInt(d);
        return e > f ? e : f;
    }
}