class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;
        String a = myString.toLowerCase();
        String b = pat.toLowerCase();
        if (a.contains(b)) answer = 1;
        return answer;
    }
}