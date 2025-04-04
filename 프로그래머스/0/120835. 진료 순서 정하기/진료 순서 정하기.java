import java.util.Arrays;

class Solution {
    public int[] solution(int[] emergency) {
        int len = emergency.length;
        int[] answer = new int[len];
        int[] sorted = emergency.clone();
        Arrays.sort(sorted);
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len; j++) {
                if (emergency[i] == sorted[j]) {
                    answer[i] = len - j;
                }
            }
        }
        return answer;
    }
}