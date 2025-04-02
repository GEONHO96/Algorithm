import java.util.List;
import java.util.ArrayList;

class Solution {
    public int[] solution(int[] arr, int[] delete_list) {
        int len1 = arr.length;
        int len2 = delete_list.length;
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < len1; i++) {
            boolean toDelete = false;
            for (int j = 0; j < len2; j++) {
                if (arr[i] == delete_list[j]) {
                    toDelete = true;
                    break;
                }
            }
            if (!toDelete) list.add(arr[i]);
        }
        int[] ans = list.stream().mapToInt(Integer::intValue).toArray();
        return ans;
    }
}