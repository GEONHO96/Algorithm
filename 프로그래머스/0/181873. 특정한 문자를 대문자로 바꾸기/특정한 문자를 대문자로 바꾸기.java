class Solution {
    public String solution(String my_string, String alp) {
        String answer = "";
        int n = my_string.length();
        for (int i = 0; i < n; i++) {
            if (my_string.charAt(i) == alp.charAt(0)) answer += Character.toUpperCase(my_string.charAt(i));
            else answer += my_string.charAt(i);
        }
        return answer;
    }
}