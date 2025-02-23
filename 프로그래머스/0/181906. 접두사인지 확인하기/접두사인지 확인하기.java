import java.util.Arrays;

class Solution {
    public int solution(String my_string, String is_prefix) {
        int answer = 0;
        int len = my_string.length();
        String[] prefix = new String[len];
        for (int i = 0; i < len; i++) {
            prefix[i] = my_string.substring(0, i);
            if (is_prefix.equals(prefix[i])) {
                answer = 1;
            }
        }
        return answer;
    }
}