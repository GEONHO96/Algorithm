class Solution {
    public int solution(int i, int j, int k) {
        String str = "";
        int result = 0;
        for (int l = i; l <= j; l++) {
            str += Integer.toString(l);
        }
        for (int m = 0; m < str.length(); m++) {
            if (str.charAt(m) == (char)(k + '0')) {
                result++;
            }
        }
        return result;
    }
}