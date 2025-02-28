class Solution {
    public int solution(int[] num_list) {
        int sum = 0;
        int mul = 1;
        int len = num_list.length;
        if (len >= 11) {
            for (int i = 0; i < len; i++) {
                sum += num_list[i];
            }
        } else {
            for (int i = 0; i < len; i++) {
                mul *= num_list[i];
            }
        }
        return len >= 11 ? sum : mul;
    }
}