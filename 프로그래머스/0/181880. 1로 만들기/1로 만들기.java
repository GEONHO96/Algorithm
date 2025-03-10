class Solution {
    public int solution(int[] num_list) {
        int count = 0;
        int len = num_list.length;
        for (int i = 0; i < len; i++) {
            while (num_list[i] > 1) {
                if (num_list[i] % 2 == 0) {
                    num_list[i] /= 2;
                } else {
                    num_list[i] -= 1;
                    num_list[i] /= 2;
                }
                count++;
            }
        }
        return count;
    }
}