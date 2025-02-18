class Solution {
    public String solution(String rny_string) {
        String answer = "";
        int n = rny_string.length();
        for (int i = 0; i < n; i++) {
            if (rny_string.charAt(i) == 'm') {
                answer += "rn";
            } else {
                answer += rny_string.charAt(i);
            }
        }
        return answer;
    }
}