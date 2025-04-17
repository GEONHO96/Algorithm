import java.util.Arrays;
import java.util.Collections;

class Solution {
    public int solution(int[] A, int[] B) {
        int n = A.length;
        int minSum = 0;
        Arrays.sort(A);
        Arrays.sort(B);
        for (int i = 0; i < n; i++) {
            minSum += A[i] * B[n - i - 1];
        }
        return minSum;
    }
}