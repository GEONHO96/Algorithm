class Solution {
    public int solution(int n) {
        String ternary = Integer.toString(n, 3);
        int m = ternary.length();
        String reverseTernary = "";
        for (int i = m - 1; i >= 0; i--) {
            reverseTernary += ternary.charAt(i);
        }
        return Integer.parseInt(reverseTernary, 3);
    }
}