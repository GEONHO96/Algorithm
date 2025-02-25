class Solution {
    public int solution(int n) {
        int min = 1000000;
        for (int i = n; i >= 1; i--) {
            if (n % i == 1) min = Math.min(min, i);
        }
        return min;
    }
}