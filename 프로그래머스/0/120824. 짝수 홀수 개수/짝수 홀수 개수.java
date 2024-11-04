class Solution {
    public int[] solution(int[] num_list) {
        int even = 0;
        int odd = 0;
        for (int i = 0; i < num_list.length; i++) {
            if (num_list[i] % 2 == 0) {
                even++;
            }
            if (num_list[i] % 2 == 1) {
                odd++;
            }
        }
        int[] answer = {even, odd};
        return answer;
    }
}