class Solution {
    public String solution(String myString) {
        String answer = "";
        for (int i = 0; i < myString.length(); i++) {
            if (myString.charAt(i) >= 'a' && myString.charAt(i) <= 'z') {
                answer += (char) (myString.charAt(i) - 'a' + 'A');
            }
            if (myString.charAt(i) >= 'A' && myString.charAt(i) <= 'Z') {
                answer += myString.charAt(i);
            }
        }
        return answer;
    }
}