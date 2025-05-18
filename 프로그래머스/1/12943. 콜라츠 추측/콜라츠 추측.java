class Solution {
    public int solution(long n) {
        int count = 0;
        while (n > 1) {
            if (n % 2 == 0) {
                n /= 2;
            } else {
                n = 3 * n + 1;
            }
            count++;
        }
        if (count > 500) return -1;
        else return count;
    }
}