class Solution {
    public int solution(int[] a, int[] b) {
        int len = a.length;
        int innerProduct = 0;
        for (int i = 0; i < len; i++) {
            innerProduct += a[i] * b[i];
        }
        return innerProduct;
    }
}