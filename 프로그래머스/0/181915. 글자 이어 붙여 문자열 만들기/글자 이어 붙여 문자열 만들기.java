class Solution {
    public String solution(String my_string, int[] index_list) {
        String answer = "";
        int len = index_list.length;
        for (int i = 0; i < len; i++) {
            answer += my_string.charAt(index_list[i]);
        }
        return answer;
    }
}