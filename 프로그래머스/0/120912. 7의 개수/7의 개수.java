class Solution {
    public int solution(int[] array) {
        int answer = 0;
        int length = array.length;
        for (int i = 0; i < length; i++) {
            while (array[i] > 0) {
                if (array[i] % 10 == 7) answer++;
                array[i] /= 10;
            }
        }
        return answer;
    }
}