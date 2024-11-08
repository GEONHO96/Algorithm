class Solution {
    public String solution(String myString) {
        String answer = "";
        for (int i = 0; i < myString.length(); i++) {
            if (myString.charAt(i) >= 'A' && myString.charAt(i) <= 'Z') {
                answer += (char) (myString.charAt(i) - 'A' + 'a');
            }
            if (myString.charAt(i) >= 'a' && myString.charAt(i) <= 'z') {
                answer += myString.charAt(i);
            }
        }
        return answer;
    }
}