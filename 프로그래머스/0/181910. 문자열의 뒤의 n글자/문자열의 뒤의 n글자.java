class Solution {
    public String solution(String my_string, int n) {
        String answer = "";
        int len = my_string.length();
        for (int i = 0; i < len; i++) {
            answer = my_string.substring(len - n);
        }
        return answer;
    }
}