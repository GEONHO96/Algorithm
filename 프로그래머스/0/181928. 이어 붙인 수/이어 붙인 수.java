class Solution {
    public int solution(int[] num_list) {
        int len = num_list.length;
        String even = "";
        String odd = "";
        for (int i = 0; i < len; i++) {
            if (num_list[i] % 2 == 0) {
                even += num_list[i];
            } else {
                odd += num_list[i];
            }
        }
        return Integer.parseInt(even) + Integer.parseInt(odd);
    }
}