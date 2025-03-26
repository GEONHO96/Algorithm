class Solution {
    public long solution(long n) {
        return n % Math.sqrt(n) == 0 ? (long) ((Math.sqrt(n) + 1) * (Math.sqrt(n) + 1)) : -1;
    }
}