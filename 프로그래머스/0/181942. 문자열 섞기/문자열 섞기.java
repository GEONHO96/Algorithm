class Solution {
    public String solution(String str1, String str2) {
        String answer = "";
        int len1 = str1.length();
        int len2 = str2.length();
        int minLen = Math.min(len1, len2);
        for (int i = 0; i < minLen; i++) {
            answer += str1.charAt(i);
            answer += str2.charAt(i);
        }
        if (len1 > len2) {
            answer += str1.substring(len1);
        } else {
            answer += str2.substring(len2);
        }
        return answer;
    }
}