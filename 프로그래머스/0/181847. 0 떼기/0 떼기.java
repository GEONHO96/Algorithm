class Solution {
    public String solution(String n_str) {
        String answer = "";
        answer = n_str;
        while (answer.charAt(0) == '0') {
            answer = answer.substring(1);
        }
        return answer;
    }
}