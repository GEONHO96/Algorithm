class Solution {
    public int solution(int[] num_list) {
        int n = num_list.length;
        int mul = 1;
        int sum = 0;
        int squaredSum = 0;
        for (int i = 0; i < n; i++) {
            mul *= num_list[i];
            sum += num_list[i];
        }
        squaredSum = sum * sum;
        return mul < squaredSum ? 1 : 0;
    }
}