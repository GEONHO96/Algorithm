import java.util.List;
import java.util.ArrayList;
import java.util.Set;
import java.util.HashSet;

class Solution {
    public int[] solution(int[] arr, int k) {
        List<Integer> list = new ArrayList<>();
        Set<Integer> set = new HashSet<>();
        for (int num : arr) {
            if (!set.contains(num)) {
                set.add(num);
                list.add(num);
                if (list.size() == k) {
                    break;
                }
            } 
        }
        int[] ans = new int[k];
        for (int i = 0; i < k; i++) {
            if (i < list.size()) {
                ans[i] = list.get(i);
            } else {
                ans[i] = -1;
            }
        }
        return ans;
    }
}