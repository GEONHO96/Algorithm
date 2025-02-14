class Solution {
    public String solution(String myString) {
        String answer = "";
        int length = myString.length();
        for (int i = 0; i < length; i++) {
            if ('B' <= myString.charAt(i) && myString.charAt(i) <= 'Z') {
                answer += Character.toLowerCase(myString.charAt(i));
            } else if (myString.charAt(i) == 'a') {
                answer += 'A';
            } else {
                answer += myString.charAt(i);
            }
        }
        return answer;
    }
}