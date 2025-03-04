class Solution {
    public int[] solution(String my_string) {
        int[] answer = new int[52];
        int len = my_string.length();
        for (int i = 0; i < len; i++) {
            if ('a' <= my_string.charAt(i) && my_string.charAt(i) <= 'z') {
                answer[my_string.charAt(i) - 'A' - 6]++;
            }
            if ('A' <= my_string.charAt(i) && my_string.charAt(i) <= 'Z') {
                answer[my_string.charAt(i) - 'A']++;
            }
        }
        return answer;
    }
}