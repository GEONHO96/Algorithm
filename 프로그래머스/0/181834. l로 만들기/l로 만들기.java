class Solution {
    public String solution(String myString) {
        String answer = "";
        int len = myString.length();
        for (int i = 0; i < len; i++) {
            if ('a' <= myString.charAt(i) && myString.charAt(i) < 'l') {
                answer += "l";
            } else {
                answer += myString.charAt(i);
            }
        }
        return answer;
    }
}