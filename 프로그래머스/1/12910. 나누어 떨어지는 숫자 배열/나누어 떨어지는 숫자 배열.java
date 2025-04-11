import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

class Solution {
    public int[] solution(int[] arr, int divisor) {
        List<Integer> list = new ArrayList<>();
        for (int num : arr) {
            if (num % divisor == 0) list.add(num);
        }
        if (list.isEmpty()) {
            return new int[]{-1};
        }
        Collections.sort(list);
        int[] ans = list.stream().mapToInt(Integer::intValue).toArray();
        return ans;
    }
}