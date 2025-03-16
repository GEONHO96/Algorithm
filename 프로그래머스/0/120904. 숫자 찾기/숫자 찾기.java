class Solution {
    public int solution(int num, int k) {
        String number = String.valueOf(num);
        int len = number.length();
        int answer = -1;
        for (int i = 0; i < len; i++) {
            char ch = number.charAt(i);
            if (Integer.parseInt(String.valueOf(ch)) == k) {
                answer = i + 1;
                break;
            }
        }
        return answer;
    }
}