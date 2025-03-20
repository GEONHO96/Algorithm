class Solution {
    public static int solution(int n) {
        return Math.sqrt(n) % 1 == 0 ? 1 : 2;
    }
}