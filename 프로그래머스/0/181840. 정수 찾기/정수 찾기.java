class Solution {
    public int solution(int[] num_list, int n) {
        int answer = 0;
        int len = num_list.length;
        for (int i = 0; i < len; i++) {
            if (num_list[i] == n) {
                answer = 1;
                break;
            }
        }
        return answer;
    }
}