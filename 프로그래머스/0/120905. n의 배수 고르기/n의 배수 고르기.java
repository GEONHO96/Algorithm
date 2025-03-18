import java.util.List;
import java.util.ArrayList;

class Solution {
    public int[] solution(int n, int[] numlist) {
        List<Integer> divisor = new ArrayList<>();
        int len = numlist.length;
        for (int i = 0; i < len; i++) {
            if (numlist[i] % n == 0) {
                divisor.add(numlist[i]);
            }
        }
        return divisor.stream().mapToInt(Integer::intValue).toArray();
    }
}