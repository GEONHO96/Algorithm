import java.util.Arrays;

class Solution {
    public int[] solution(int[] num_list) {
        Arrays.sort(num_list);
        int len = num_list.length;
        int[] answer = new int[len - 5];
        for (int i = 0; i < len - 5; i++) {
            answer[i] = num_list[i + 5];
        }
        return answer;
    }
}