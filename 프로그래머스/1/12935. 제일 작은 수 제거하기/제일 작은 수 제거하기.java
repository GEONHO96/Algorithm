import java.util.List;
import java.util.ArrayList;

class Solution {
    public int[] solution(int[] arr) {
        if (arr.length == 1) return new int[]{-1};
        int min = arr[0];
        for (int num : arr) {
            if (num < min) min = num;
        }
        List<Integer> list = new ArrayList<>();
        for (int num : arr) {
            if (num != min) list.add(num);
        }
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}